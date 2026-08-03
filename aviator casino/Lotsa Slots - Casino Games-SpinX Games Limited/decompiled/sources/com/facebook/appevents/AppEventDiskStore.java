package com.facebook.appevents;

/* compiled from: AppEventDiskStore.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore;", "", "()V", "PERSISTED_EVENTS_FILENAME", "", "TAG", "kotlin.jvm.PlatformType", "readAndClearStore", "Lcom/facebook/appevents/PersistedEvents;", "saveEventsToDisk", "", "eventsToPersist", "saveEventsToDisk$facebook_core_release", "MovedClassObjectInputStream", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventDiskStore {
    private static final java.lang.String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    public static final com.facebook.appevents.AppEventDiskStore INSTANCE = new com.facebook.appevents.AppEventDiskStore();
    private static final java.lang.String TAG = com.facebook.appevents.AppEventDiskStore.class.getName();

    private AppEventDiskStore() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:12:0x0030, B:14:0x0037, B:17:0x00bc, B:23:0x0042, B:36:0x0067, B:38:0x006e, B:41:0x0079, B:33:0x007f, B:44:0x0084, B:46:0x008b, B:47:0x009f, B:50:0x0096, B:27:0x00a1, B:29:0x00a8, B:32:0x00b3), top: B:3:0x0003, inners: #5, #8, #9, #10 }] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized com.facebook.appevents.PersistedEvents readAndClearStore() {
        com.facebook.appevents.PersistedEvents persistedEvents;
        java.lang.Throwable th;
        com.facebook.appevents.AppEventDiskStore.MovedClassObjectInputStream movedClassObjectInputStream;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Exception exc;
        java.lang.Object readObject;
        synchronized (com.facebook.appevents.AppEventDiskStore.class) {
            com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
            com.facebook.appevents.internal.AppEventUtility.assertIsNotMainThread();
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            persistedEvents = null;
            try {
                try {
                    java.io.FileInputStream openFileInput = applicationContext.openFileInput(PERSISTED_EVENTS_FILENAME);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    movedClassObjectInputStream = new com.facebook.appevents.AppEventDiskStore.MovedClassObjectInputStream(new java.io.BufferedInputStream(openFileInput));
                    try {
                        readObject = movedClassObjectInputStream.readObject();
                    } catch (java.io.FileNotFoundException unused) {
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (java.lang.Exception e) {
                            str = TAG;
                            str2 = "Got unexpected exception when removing events file: ";
                            exc = e;
                            android.util.Log.w(str, str2, exc);
                            if (persistedEvents == null) {
                            }
                            return persistedEvents;
                        }
                        if (persistedEvents == null) {
                        }
                        return persistedEvents;
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        android.util.Log.w(TAG, "Got unexpected exception while reading events: ", e);
                        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (java.lang.Exception e3) {
                            str = TAG;
                            str2 = "Got unexpected exception when removing events file: ";
                            exc = e3;
                            android.util.Log.w(str, str2, exc);
                            if (persistedEvents == null) {
                            }
                            return persistedEvents;
                        }
                        if (persistedEvents == null) {
                        }
                        return persistedEvents;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.closeQuietly((java.io.Closeable) null);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (java.lang.Exception e4) {
                        android.util.Log.w(TAG, "Got unexpected exception when removing events file: ", e4);
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException unused2) {
                movedClassObjectInputStream = null;
            } catch (java.lang.Exception e5) {
                e = e5;
                movedClassObjectInputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                com.facebook.internal.Utility utility32 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.closeQuietly((java.io.Closeable) null);
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                throw th;
            }
            if (readObject == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
            }
            com.facebook.appevents.PersistedEvents persistedEvents2 = (com.facebook.appevents.PersistedEvents) readObject;
            com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.closeQuietly(movedClassObjectInputStream);
            try {
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
            } catch (java.lang.Exception e6) {
                android.util.Log.w(TAG, "Got unexpected exception when removing events file: ", e6);
            }
            persistedEvents = persistedEvents2;
            if (persistedEvents == null) {
                persistedEvents = new com.facebook.appevents.PersistedEvents();
            }
        }
        return persistedEvents;
    }

    @kotlin.jvm.JvmStatic
    public static final void saveEventsToDisk$facebook_core_release(com.facebook.appevents.PersistedEvents eventsToPersist) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        java.io.ObjectOutputStream objectOutputStream = null;
        try {
            java.io.ObjectOutputStream objectOutputStream2 = new java.io.ObjectOutputStream(new java.io.BufferedOutputStream(applicationContext.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
            try {
                objectOutputStream2.writeObject(eventsToPersist);
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.closeQuietly(objectOutputStream2);
            } catch (java.lang.Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                try {
                    android.util.Log.w(TAG, "Got unexpected exception while persisting events: ", th);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (java.lang.Exception unused) {
                    }
                } finally {
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.closeQuietly(objectOutputStream);
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* compiled from: AppEventDiskStore.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore$MovedClassObjectInputStream;", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "readClassDescriptor", "Ljava/io/ObjectStreamClass;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class MovedClassObjectInputStream extends java.io.ObjectInputStream {
        private static final java.lang.String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final java.lang.String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";

        public MovedClassObjectInputStream(java.io.InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected java.io.ObjectStreamClass readClassDescriptor() throws java.io.IOException, java.lang.ClassNotFoundException {
            java.io.ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (kotlin.jvm.internal.Intrinsics.areEqual(resultClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = java.io.ObjectStreamClass.lookup(com.facebook.appevents.AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(resultClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = java.io.ObjectStreamClass.lookup(com.facebook.appevents.AppEvent.SerializationProxyV2.class);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }
}
