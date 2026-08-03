package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxSound {
    private static final int INVALID_SOUND_ID = -1;
    private static final int INVALID_STREAM_ID = -1;
    private static final int LOAD_TIME_OUT = 500;
    private static final int MAX_SIMULTANEOUS_STREAMS_DEFAULT = 5;
    private static final int MAX_SIMULTANEOUS_STREAMS_I9100 = 3;
    private static final int SOUND_PRIORITY = 1;
    private static final int SOUND_QUALITY = 5;
    private static final float SOUND_RATE = 1.0f;
    private static final java.lang.String TAG = "Cocos2dxSound";
    private final android.content.Context mContext;
    private float mLeftVolume;
    private float mRightVolume;
    private android.media.SoundPool mSoundPool;
    private boolean mIsAudioFocus = true;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Integer>> mPathStreamIDsMap = new java.util.HashMap<>();
    private final java.lang.Object mLockPathStreamIDsMap = new java.lang.Object();
    private final java.util.HashMap<java.lang.String, java.lang.Integer> mPathSoundIDMap = new java.util.HashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, org.cocos2dx.lib.Cocos2dxSound.SoundInfoForLoadedCompleted> mPlayWhenLoadedEffects = new java.util.concurrent.ConcurrentHashMap<>();

    public Cocos2dxSound(android.content.Context context) {
        this.mContext = context;
        initData();
    }

    private void initData() {
        if (org.cocos2dx.lib.Cocos2dxHelper.getDeviceModel().contains("GT-I9100")) {
            this.mSoundPool = new android.media.SoundPool(3, 3, 5);
        } else {
            this.mSoundPool = new android.media.SoundPool(5, 3, 5);
        }
        this.mSoundPool.setOnLoadCompleteListener(new org.cocos2dx.lib.Cocos2dxSound.OnLoadCompletedListener());
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
    }

    public int preloadEffect(java.lang.String str) {
        if (!org.cocos2dx.lib.Cocos2dxHelper.isActivityVisible()) {
            return -1;
        }
        java.lang.Integer num = this.mPathSoundIDMap.get(str);
        if (num == null) {
            int createSoundIDFromAsset = createSoundIDFromAsset(str);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(createSoundIDFromAsset);
            valueOf.getClass();
            if (createSoundIDFromAsset != -1) {
                this.mPathSoundIDMap.put(str, valueOf);
            }
            num = valueOf;
        }
        return num.intValue();
    }

    public void unloadEffect(java.lang.String str) {
        synchronized (this.mLockPathStreamIDsMap) {
            java.util.ArrayList<java.lang.Integer> arrayList = this.mPathStreamIDsMap.get(str);
            if (arrayList != null) {
                java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
                while (it.hasNext()) {
                    this.mSoundPool.stop(it.next().intValue());
                }
            }
            this.mPathStreamIDsMap.remove(str);
        }
        java.lang.Integer num = this.mPathSoundIDMap.get(str);
        if (num != null) {
            this.mSoundPool.unload(num.intValue());
            this.mPathSoundIDMap.remove(str);
        }
    }

    public int playEffect(java.lang.String str, boolean z, float f, float f2, float f3) {
        if (!org.cocos2dx.lib.Cocos2dxHelper.isActivityVisible()) {
            return -1;
        }
        java.lang.Integer num = this.mPathSoundIDMap.get(str);
        if (num != null) {
            return doPlayEffect(str, num.intValue(), z, f, f2, f3);
        }
        int preloadEffect = preloadEffect(str);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(preloadEffect);
        valueOf.getClass();
        if (preloadEffect == -1) {
            return -1;
        }
        org.cocos2dx.lib.Cocos2dxSound.SoundInfoForLoadedCompleted soundInfoForLoadedCompleted = new org.cocos2dx.lib.Cocos2dxSound.SoundInfoForLoadedCompleted(str, z, f, f2, f3);
        this.mPlayWhenLoadedEffects.putIfAbsent(valueOf, soundInfoForLoadedCompleted);
        synchronized (soundInfoForLoadedCompleted) {
            try {
                soundInfoForLoadedCompleted.wait(500L);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        int i = soundInfoForLoadedCompleted.effectID;
        this.mPlayWhenLoadedEffects.remove(valueOf);
        return i;
    }

    public void stopEffect(int i) {
        this.mSoundPool.stop(i);
        synchronized (this.mLockPathStreamIDsMap) {
            java.util.Iterator<java.lang.String> it = this.mPathStreamIDsMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String next = it.next();
                if (this.mPathStreamIDsMap.get(next).contains(java.lang.Integer.valueOf(i))) {
                    this.mPathStreamIDsMap.get(next).remove(this.mPathStreamIDsMap.get(next).indexOf(java.lang.Integer.valueOf(i)));
                    break;
                }
            }
        }
    }

    public void pauseEffect(int i) {
        this.mSoundPool.pause(i);
    }

    public void resumeEffect(int i) {
        this.mSoundPool.resume(i);
    }

    public void pauseAllEffects() {
        synchronized (this.mLockPathStreamIDsMap) {
            if (!this.mPathStreamIDsMap.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.ArrayList<java.lang.Integer>>> it = this.mPathStreamIDsMap.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Iterator<java.lang.Integer> it2 = it.next().getValue().iterator();
                    while (it2.hasNext()) {
                        this.mSoundPool.pause(it2.next().intValue());
                    }
                }
            }
        }
    }

    public void resumeAllEffects() {
        synchronized (this.mLockPathStreamIDsMap) {
            if (!this.mPathStreamIDsMap.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.ArrayList<java.lang.Integer>>> it = this.mPathStreamIDsMap.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Iterator<java.lang.Integer> it2 = it.next().getValue().iterator();
                    while (it2.hasNext()) {
                        this.mSoundPool.resume(it2.next().intValue());
                    }
                }
            }
        }
    }

    public void stopAllEffects() {
        synchronized (this.mLockPathStreamIDsMap) {
            if (!this.mPathStreamIDsMap.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.ArrayList<java.lang.Integer>>> it = this.mPathStreamIDsMap.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Iterator<java.lang.Integer> it2 = it.next().getValue().iterator();
                    while (it2.hasNext()) {
                        this.mSoundPool.stop(it2.next().intValue());
                    }
                }
            }
            this.mPathStreamIDsMap.clear();
        }
    }

    public float getEffectsVolume() {
        return (this.mLeftVolume + this.mRightVolume) / 2.0f;
    }

    public void setEffectsVolume(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.mRightVolume = f;
        this.mLeftVolume = f;
        if (this.mIsAudioFocus) {
            setEffectsVolumeInternal(f, f);
        }
    }

    private void setEffectsVolumeInternal(float f, float f2) {
        synchronized (this.mLockPathStreamIDsMap) {
            if (!this.mPathStreamIDsMap.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.ArrayList<java.lang.Integer>>> it = this.mPathStreamIDsMap.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Iterator<java.lang.Integer> it2 = it.next().getValue().iterator();
                    while (it2.hasNext()) {
                        this.mSoundPool.setVolume(it2.next().intValue(), f, f2);
                    }
                }
            }
        }
    }

    public void end() {
        this.mSoundPool.release();
        synchronized (this.mLockPathStreamIDsMap) {
            this.mPathStreamIDsMap.clear();
        }
        this.mPathSoundIDMap.clear();
        this.mPlayWhenLoadedEffects.clear();
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
        initData();
    }

    private int createSoundIDFromAsset(java.lang.String str) {
        int i;
        try {
            if (str.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                i = this.mSoundPool.load(str, 0);
            } else {
                android.content.res.AssetFileDescriptor openFd = this.mContext.getAssets().openFd(str);
                int load = this.mSoundPool.load(openFd, 0);
                openFd.close();
                i = load;
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "error: " + e.getMessage(), e);
            i = -1;
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    private float clamp(float f, float f2, float f3) {
        return java.lang.Math.max(f2, java.lang.Math.min(f, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int doPlayEffect(java.lang.String str, int i, boolean z, float f, float f2, float f3) {
        float clamp = this.mLeftVolume * f3 * (1.0f - clamp(f2, 0.0f, 1.0f));
        float clamp2 = this.mRightVolume * f3 * (1.0f - clamp(-f2, 0.0f, 1.0f));
        float clamp3 = clamp(f * 1.0f, 0.5f, 2.0f);
        if (!org.cocos2dx.lib.Cocos2dxHelper.isActivityVisible()) {
            return -1;
        }
        int play = this.mSoundPool.play(i, clamp(clamp, 0.0f, 1.0f), clamp(clamp2, 0.0f, 1.0f), 1, z ? -1 : 0, clamp3);
        synchronized (this.mLockPathStreamIDsMap) {
            java.util.ArrayList<java.lang.Integer> arrayList = this.mPathStreamIDsMap.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                this.mPathStreamIDsMap.put(str, arrayList);
            }
            arrayList.add(java.lang.Integer.valueOf(play));
        }
        return play;
    }

    public void onEnterBackground() {
        this.mSoundPool.autoPause();
    }

    public void onEnterForeground() {
        this.mSoundPool.autoResume();
    }

    void setAudioFocus(boolean z) {
        this.mIsAudioFocus = z;
        setEffectsVolumeInternal(z ? this.mLeftVolume : 0.0f, z ? this.mRightVolume : 0.0f);
    }

    private class SoundInfoForLoadedCompleted {
        int effectID = -1;
        float gain;
        boolean isLoop;
        float pan;
        java.lang.String path;
        float pitch;

        SoundInfoForLoadedCompleted(java.lang.String str, boolean z, float f, float f2, float f3) {
            this.path = str;
            this.isLoop = z;
            this.pitch = f;
            this.pan = f2;
            this.gain = f3;
        }
    }

    public class OnLoadCompletedListener implements android.media.SoundPool.OnLoadCompleteListener {
        public OnLoadCompletedListener() {
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(android.media.SoundPool soundPool, int i, int i2) {
            org.cocos2dx.lib.Cocos2dxSound.SoundInfoForLoadedCompleted soundInfoForLoadedCompleted;
            if (i2 != 0 || (soundInfoForLoadedCompleted = (org.cocos2dx.lib.Cocos2dxSound.SoundInfoForLoadedCompleted) org.cocos2dx.lib.Cocos2dxSound.this.mPlayWhenLoadedEffects.get(java.lang.Integer.valueOf(i))) == null) {
                return;
            }
            soundInfoForLoadedCompleted.effectID = org.cocos2dx.lib.Cocos2dxSound.this.doPlayEffect(soundInfoForLoadedCompleted.path, i, soundInfoForLoadedCompleted.isLoop, soundInfoForLoadedCompleted.pitch, soundInfoForLoadedCompleted.pan, soundInfoForLoadedCompleted.gain);
            synchronized (soundInfoForLoadedCompleted) {
                soundInfoForLoadedCompleted.notifyAll();
            }
        }
    }
}
