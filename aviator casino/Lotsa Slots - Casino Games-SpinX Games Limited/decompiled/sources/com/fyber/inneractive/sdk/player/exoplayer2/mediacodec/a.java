package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4035a;
    public final boolean b;
    public final boolean c;
    public final java.lang.String d;
    public final android.media.MediaCodecInfo.CodecCapabilities e;

    public a(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        str.getClass();
        this.f4035a = str;
        this.d = str2;
        this.e = codecCapabilities;
        this.b = !z && codecCapabilities != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.c = codecCapabilities != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean a(java.lang.String str) {
        java.lang.String a2;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        java.lang.Integer valueOf;
        java.lang.Integer valueOf2;
        if (str == null || this.d == null || (a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.d.equals(a2)) {
            b("codec.mime " + str + ", " + a2);
            return false;
        }
        java.util.regex.Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.f4039a;
        java.lang.String[] split = str.split("\\.");
        java.lang.String str2 = split[0];
        str2.getClass();
        str2.hashCode();
        int i = 2;
        char c = 65535;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 1;
                    break;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 2;
                    break;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 3;
                    break;
                }
                break;
        }
        android.util.Pair pair = null;
        switch (c) {
            case 0:
            case 1:
                if (split.length < 2) {
                    android.util.Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    break;
                } else {
                    try {
                        if (split[1].length() == 6) {
                            valueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt(split[1].substring(0, 2), 16));
                            valueOf2 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(split[1].substring(4), 16));
                        } else if (split.length < 3) {
                            android.util.Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                            break;
                        } else {
                            valueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt(split[1]));
                            valueOf2 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(split[2]));
                        }
                        pair = new android.util.Pair(java.lang.Integer.valueOf(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.c.get(valueOf.intValue())), java.lang.Integer.valueOf(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.d.get(valueOf2.intValue())));
                        break;
                    } catch (java.lang.NumberFormatException unused) {
                        android.util.Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        break;
                    }
                }
            case 2:
            case 3:
                if (split.length < 4) {
                    android.util.Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    break;
                } else {
                    java.util.regex.Matcher matcher = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.f4039a.matcher(split[1]);
                    if (matcher.matches()) {
                        java.lang.String group = matcher.group(1);
                        if ("1".equals(group)) {
                            i = 1;
                        } else if (!"2".equals(group)) {
                            android.util.Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                            break;
                        }
                        java.lang.Integer num = (java.lang.Integer) com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.e.get(split[3]);
                        if (num == null) {
                            android.util.Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                            break;
                        } else {
                            pair = new android.util.Pair(java.lang.Integer.valueOf(i), num);
                            break;
                        }
                    } else {
                        android.util.Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                        break;
                    }
                }
        }
        if (pair == null) {
            return true;
        }
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((java.lang.Integer) pair.first).intValue() && codecProfileLevel.level >= ((java.lang.Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + a2);
        return false;
    }

    public final boolean b(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        b("sampleRate.support, " + i);
        return false;
    }

    public final void b(java.lang.String str) {
        android.util.Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f4035a + ", " + this.d + "] [" + com.fyber.inneractive.sdk.player.exoplayer2.util.z.e + com.ironsource.X3.j.e);
    }

    public final boolean a(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d != -1.0d && d > 0.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i, i2, d);
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i, i2);
        }
        if (isSizeSupported) {
            return true;
        }
        if (i < i2) {
            if (d != -1.0d && d > 0.0d) {
                isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i2, i, d);
            } else {
                isSizeSupported2 = videoCapabilities.isSizeSupported(i2, i);
            }
            if (isSizeSupported2) {
                android.util.Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f4035a + ", " + this.d + "] [" + com.fyber.inneractive.sdk.player.exoplayer2.util.z.e + com.ironsource.X3.j.e);
                return true;
            }
        }
        b("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
        return false;
    }

    public final android.graphics.Point a(int i, int i2) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("align.caps");
            return null;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        return new android.graphics.Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i) {
        int i2;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        java.lang.String str = this.f4035a;
        java.lang.String str2 = this.d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i2 = 6;
            } else {
                i2 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            android.util.Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i2 + com.ironsource.X3.j.e);
            maxInputChannelCount = i2;
        }
        if (maxInputChannelCount >= i) {
            return true;
        }
        b("channelCount.support, " + i);
        return false;
    }
}
