package com.google.firebase.sessions;

/* compiled from: UuidGenerator.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/UuidGeneratorImpl;", "Lcom/google/firebase/sessions/UuidGenerator;", "()V", io.ktor.http.LinkHeader.Rel.Next, "Ljava/util/UUID;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UuidGeneratorImpl implements com.google.firebase.sessions.UuidGenerator {
    public static final com.google.firebase.sessions.UuidGeneratorImpl INSTANCE = new com.google.firebase.sessions.UuidGeneratorImpl();

    private UuidGeneratorImpl() {
    }

    @Override // com.google.firebase.sessions.UuidGenerator
    public java.util.UUID next() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        return randomUUID;
    }
}
