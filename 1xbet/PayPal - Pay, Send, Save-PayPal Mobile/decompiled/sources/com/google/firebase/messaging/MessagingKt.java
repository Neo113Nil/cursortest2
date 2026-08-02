package com.google.firebase.messaging;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$Builder;", "", "Lkotlin/ExtensionFunctionType;", "init", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/google/firebase/messaging/RemoteMessage;", "Lcom/google/firebase/Firebase;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "getMessaging", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/messaging/FirebaseMessaging;", "messaging"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessagingKt {
    public static final com.google.firebase.messaging.FirebaseMessaging getMessaging(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        com.google.firebase.messaging.FirebaseMessaging firebaseMessaging = com.google.firebase.messaging.FirebaseMessaging.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "");
        return firebaseMessaging;
    }

    public static final com.google.firebase.messaging.RemoteMessage remoteMessage(java.lang.String str, kotlin.jvm.functions.Function1<? super com.google.firebase.messaging.RemoteMessage.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.firebase.messaging.RemoteMessage.Builder builder = new com.google.firebase.messaging.RemoteMessage.Builder(str);
        function1.invoke(builder);
        com.google.firebase.messaging.RemoteMessage build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
