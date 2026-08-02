package com.google.firebase;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f\u001a)\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\r\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/google/firebase/Firebase;", "", "name", "Lcom/google/firebase/FirebaseApp;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "(Lcom/google/firebase/Firebase;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;", "Landroid/content/Context;", "context", "initialize", "(Lcom/google/firebase/Firebase;Landroid/content/Context;)Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/FirebaseOptions;", "options", "(Lcom/google/firebase/Firebase;Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;)Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/Firebase;Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;", "", "T", "Lcom/google/firebase/components/Component;", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "()Lcom/google/firebase/components/Component;", "getApp", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseApp;", "getOptions", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseOptions;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FirebaseKt {
    public static final com.google.firebase.FirebaseApp getApp(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        com.google.firebase.FirebaseApp firebaseApp = com.google.firebase.FirebaseApp.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseApp, "");
        return firebaseApp;
    }

    public static final com.google.firebase.FirebaseApp app(com.google.firebase.Firebase firebase, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.firebase.FirebaseApp firebaseApp = com.google.firebase.FirebaseApp.getInstance(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseApp, "");
        return firebaseApp;
    }

    public static final com.google.firebase.FirebaseApp initialize(com.google.firebase.Firebase firebase, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return com.google.firebase.FirebaseApp.initializeApp(context);
    }

    public static final com.google.firebase.FirebaseApp initialize(com.google.firebase.Firebase firebase, android.content.Context context, com.google.firebase.FirebaseOptions firebaseOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseOptions, "");
        com.google.firebase.FirebaseApp initializeApp = com.google.firebase.FirebaseApp.initializeApp(context, firebaseOptions);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializeApp, "");
        return initializeApp;
    }

    public static final com.google.firebase.FirebaseApp initialize(com.google.firebase.Firebase firebase, android.content.Context context, com.google.firebase.FirebaseOptions firebaseOptions, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.firebase.FirebaseApp initializeApp = com.google.firebase.FirebaseApp.initializeApp(context, firebaseOptions, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializeApp, "");
        return initializeApp;
    }

    public static final com.google.firebase.FirebaseOptions getOptions(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        com.google.firebase.FirebaseOptions options = getApp(com.google.firebase.Firebase.INSTANCE).getOptions();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(options, "");
        return options;
    }

    private static final /* synthetic */ <T extends java.lang.annotation.Annotation> com.google.firebase.components.Component<kotlinx.coroutines.CoroutineDispatcher> coroutineDispatcher() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.google.firebase.components.Component.Builder builder = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(java.lang.annotation.Annotation.class, kotlinx.coroutines.CoroutineDispatcher.class));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.google.firebase.components.Component.Builder add = builder.add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(java.lang.annotation.Annotation.class, java.util.concurrent.Executor.class)));
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.google.firebase.components.Component<kotlinx.coroutines.CoroutineDispatcher> build = add.factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseKt$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(java.lang.annotation.Annotation.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
