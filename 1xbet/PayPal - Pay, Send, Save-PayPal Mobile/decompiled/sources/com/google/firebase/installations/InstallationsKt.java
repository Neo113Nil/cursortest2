package com.google.firebase.installations;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/firebase/Firebase;", "Lcom/google/firebase/FirebaseApp;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "Lcom/google/firebase/installations/FirebaseInstallations;", "installations", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/installations/FirebaseInstallations;", "getInstallations", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/installations/FirebaseInstallations;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InstallationsKt {
    public static final com.google.firebase.installations.FirebaseInstallations getInstallations(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        com.google.firebase.installations.FirebaseInstallations firebaseInstallations = com.google.firebase.installations.FirebaseInstallations.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseInstallations, "");
        return firebaseInstallations;
    }

    public static final com.google.firebase.installations.FirebaseInstallations installations(com.google.firebase.Firebase firebase, com.google.firebase.FirebaseApp firebaseApp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseApp, "");
        com.google.firebase.installations.FirebaseInstallations firebaseInstallations = com.google.firebase.installations.FirebaseInstallations.getInstance(firebaseApp);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseInstallations, "");
        return firebaseInstallations;
    }
}
