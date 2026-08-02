package com.google.firebase.sessions;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.internal.F0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.s;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/SessionData.$serializer", "Lkotlinx/serialization/internal/M;", "Lcom/google/firebase/sessions/SessionData;", "<init>", "()V", "Lkotlinx/serialization/encoding/f;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/f;Lcom/google/firebase/sessions/SessionData;)V", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/e;)Lcom/google/firebase/sessions/SessionData;", "", "Lkotlinx/serialization/b;", "childSerializers", "()[Lkotlinx/serialization/b;", "Lkotlinx/serialization/descriptors/f;", "descriptor", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public /* synthetic */ class SessionData$$serializer implements M<SessionData> {
    public static final SessionData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        D0 d0 = new D0("com.google.firebase.sessions.SessionData", sessionData$$serializer, 3);
        d0.j("sessionDetails", false);
        d0.j("backgroundTime", true);
        d0.j("processDataMap", true);
        descriptor = d0;
    }

    private SessionData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.M
    public final kotlinx.serialization.b<?>[] childSerializers() {
        kotlinx.serialization.b[] bVarArr;
        bVarArr = SessionData.$childSerializers;
        return new kotlinx.serialization.b[]{SessionDetails$$serializer.INSTANCE, kotlinx.serialization.builtins.a.c(Time$$serializer.INSTANCE), kotlinx.serialization.builtins.a.c(bVarArr[2])};
    }

    @Override // kotlinx.serialization.a
    public final SessionData deserialize(e decoder) {
        kotlinx.serialization.b[] bVarArr;
        int i;
        SessionDetails sessionDetails;
        Time time;
        Map map;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f fVar = descriptor;
        kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
        bVarArr = SessionData.$childSerializers;
        SessionDetails sessionDetails2 = null;
        if (beginStructure.decodeSequentially()) {
            SessionDetails sessionDetails3 = (SessionDetails) beginStructure.decodeSerializableElement(fVar, 0, SessionDetails$$serializer.INSTANCE, null);
            Time time2 = (Time) beginStructure.decodeNullableSerializableElement(fVar, 1, Time$$serializer.INSTANCE, null);
            map = (Map) beginStructure.decodeNullableSerializableElement(fVar, 2, bVarArr[2], null);
            sessionDetails = sessionDetails3;
            i = 7;
            time = time2;
        } else {
            boolean z = true;
            int i2 = 0;
            Time time3 = null;
            Map map2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    sessionDetails2 = (SessionDetails) beginStructure.decodeSerializableElement(fVar, 0, SessionDetails$$serializer.INSTANCE, sessionDetails2);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    time3 = (Time) beginStructure.decodeNullableSerializableElement(fVar, 1, Time$$serializer.INSTANCE, time3);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new s(decodeElementIndex);
                    }
                    map2 = (Map) beginStructure.decodeNullableSerializableElement(fVar, 2, bVarArr[2], map2);
                    i2 |= 4;
                }
            }
            i = i2;
            sessionDetails = sessionDetails2;
            time = time3;
            map = map2;
        }
        beginStructure.endStructure(fVar);
        return new SessionData(i, sessionDetails, time, map, (N0) null);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, SessionData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f fVar = descriptor;
        d beginStructure = encoder.beginStructure(fVar);
        SessionData.write$Self$com_google_firebase_firebase_sessions(value, beginStructure, fVar);
        beginStructure.endStructure(fVar);
    }

    @Override // kotlinx.serialization.internal.M
    public kotlinx.serialization.b<?>[] typeParametersSerializers() {
        return F0.a;
    }
}
