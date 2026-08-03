package com.google.firebase.sessions.api;

/* compiled from: FirebaseSessionsDependencies.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\r\u0010\u0017\u001a\u00020\fH\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t \b* \u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t\u0018\u00010\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "()V", "TAG", "", "dependencies", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "kotlin.jvm.PlatformType", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "addDependency", "", "subscriberName", "getDependency", "getRegisteredSubscribers", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriber", "getSubscriber$com_google_firebase_firebase_sessions", "register", "subscriber", "reset", "reset$com_google_firebase_firebase_sessions", "Dependency", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseSessionsDependencies {
    private static final java.lang.String TAG = "SessionsDependencies";
    public static final com.google.firebase.sessions.api.FirebaseSessionsDependencies INSTANCE = new com.google.firebase.sessions.api.FirebaseSessionsDependencies();
    private static final java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    private FirebaseSessionsDependencies() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void addDependency(com.google.firebase.sessions.api.SessionSubscriber.Name subscriberName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        if (subscriberName == com.google.firebase.sessions.api.SessionSubscriber.Name.PERFORMANCE) {
            throw new java.lang.IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            android.util.Log.d(TAG, "Dependency " + subscriberName + " already added.");
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency(kotlinx.coroutines.sync.MutexKt.Mutex(true), null, 2, 0 == true ? 1 : 0));
        android.util.Log.d(TAG, "Dependency to " + subscriberName + " added.");
    }

    @kotlin.jvm.JvmStatic
    public static final void register(com.google.firebase.sessions.api.SessionSubscriber subscriber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        com.google.firebase.sessions.api.SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            android.util.Log.d(TAG, "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        dependency.setSubscriber(subscriber);
        android.util.Log.d(TAG, "Subscriber " + sessionSubscriberName + " registered.");
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(dependency.getMutex(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a4 -> B:10:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> continuation) {
        com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 firebaseSessionsDependencies$getRegisteredSubscribers$1;
        int i;
        java.util.Iterator it;
        java.util.Map map;
        if (continuation instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) {
            firebaseSessionsDependencies$getRegisteredSubscribers$1 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) continuation;
            if ((firebaseSessionsDependencies$getRegisteredSubscribers$1.label & Integer.MIN_VALUE) != 0) {
                firebaseSessionsDependencies$getRegisteredSubscribers$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = firebaseSessionsDependencies$getRegisteredSubscribers$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = firebaseSessionsDependencies$getRegisteredSubscribers$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies2 = dependencies;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(dependencies2.size()));
                    it = dependencies2.entrySet().iterator();
                    map = linkedHashMap;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object key = firebaseSessionsDependencies$getRegisteredSubscribers$1.L$5;
                    map = (java.util.Map) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$4;
                    kotlinx.coroutines.sync.Mutex mutex = (kotlinx.coroutines.sync.Mutex) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$3;
                    com.google.firebase.sessions.api.SessionSubscriber.Name name = (com.google.firebase.sessions.api.SessionSubscriber.Name) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$2;
                    it = (java.util.Iterator) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$1;
                    java.util.Map map2 = (java.util.Map) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        com.google.firebase.sessions.api.SessionSubscriber subscriber$com_google_firebase_firebase_sessions = INSTANCE.getSubscriber$com_google_firebase_firebase_sessions(name);
                        mutex.unlock(null);
                        map.put(key, subscriber$com_google_firebase_firebase_sessions);
                        map = map2;
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            key = entry.getKey();
                            name = (com.google.firebase.sessions.api.SessionSubscriber.Name) entry.getKey();
                            mutex = ((com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) entry.getValue()).getMutex();
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$0 = map;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$1 = it;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$2 = name;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$3 = mutex;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$4 = map;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$5 = key;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.label = 1;
                            if (mutex.lock(null, firebaseSessionsDependencies$getRegisteredSubscribers$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            map2 = map;
                            com.google.firebase.sessions.api.SessionSubscriber subscriber$com_google_firebase_firebase_sessions2 = INSTANCE.getSubscriber$com_google_firebase_firebase_sessions(name);
                            mutex.unlock(null);
                            map.put(key, subscriber$com_google_firebase_firebase_sessions2);
                            map = map2;
                            if (it.hasNext()) {
                                return map;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        mutex.unlock(null);
                        throw th;
                    }
                }
            }
        }
        firebaseSessionsDependencies$getRegisteredSubscribers$1 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1(this, continuation);
        java.lang.Object obj2 = firebaseSessionsDependencies$getRegisteredSubscribers$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = firebaseSessionsDependencies$getRegisteredSubscribers$1.label;
        if (i != 0) {
        }
    }

    public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(com.google.firebase.sessions.api.SessionSubscriber.Name subscriberName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        com.google.firebase.sessions.api.SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new java.lang.IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }

    private final com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency getDependency(com.google.firebase.sessions.api.SessionSubscriber.Name subscriberName) {
        java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies2 = dependencies;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency dependency = dependencies2.get(subscriberName);
        if (dependency != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return dependency;
        }
        throw new java.lang.IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
    }

    /* compiled from: FirebaseSessionsDependencies.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "subscriber", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "(Lkotlinx/coroutines/sync/Mutex;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "getSubscriber", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class Dependency {
        private final kotlinx.coroutines.sync.Mutex mutex;
        private com.google.firebase.sessions.api.SessionSubscriber subscriber;

        public static /* synthetic */ com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency copy$default(com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency dependency, kotlinx.coroutines.sync.Mutex mutex, com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mutex = dependency.mutex;
            }
            if ((i & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(mutex, sessionSubscriber);
        }

        /* renamed from: component1, reason: from getter */
        public final kotlinx.coroutines.sync.Mutex getMutex() {
            return this.mutex;
        }

        /* renamed from: component2, reason: from getter */
        public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public final com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency copy(kotlinx.coroutines.sync.Mutex mutex, com.google.firebase.sessions.api.SessionSubscriber subscriber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "mutex");
            return new com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency(mutex, subscriber);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency)) {
                return false;
            }
            com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency dependency = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.mutex, dependency.mutex) && kotlin.jvm.internal.Intrinsics.areEqual(this.subscriber, dependency.subscriber);
        }

        public int hashCode() {
            int hashCode = this.mutex.hashCode() * 31;
            com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber = this.subscriber;
            return hashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public java.lang.String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }

        public Dependency(kotlinx.coroutines.sync.Mutex mutex, com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = sessionSubscriber;
        }

        public /* synthetic */ Dependency(kotlinx.coroutines.sync.Mutex mutex, com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(mutex, (i & 2) != 0 ? null : sessionSubscriber);
        }

        public final kotlinx.coroutines.sync.Mutex getMutex() {
            return this.mutex;
        }

        public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public final void setSubscriber(com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }
    }
}
