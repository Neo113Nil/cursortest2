package com.google.firebase.sessions.settings;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.b;
import kotlinx.serialization.builtins.a;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.C;
import kotlinx.serialization.internal.C1138g0;
import kotlinx.serialization.internal.C1141i;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.internal.F0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.s;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/settings/SessionConfigs.$serializer", "Lkotlinx/serialization/internal/M;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "()V", "Lkotlinx/serialization/encoding/f;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/f;Lcom/google/firebase/sessions/settings/SessionConfigs;)V", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/e;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "Lkotlinx/serialization/b;", "childSerializers", "()[Lkotlinx/serialization/b;", "Lkotlinx/serialization/descriptors/f;", "descriptor", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public /* synthetic */ class SessionConfigs$$serializer implements M<SessionConfigs> {
    public static final SessionConfigs$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SessionConfigs$$serializer sessionConfigs$$serializer = new SessionConfigs$$serializer();
        INSTANCE = sessionConfigs$$serializer;
        D0 d0 = new D0("com.google.firebase.sessions.settings.SessionConfigs", sessionConfigs$$serializer, 5);
        d0.j("sessionsEnabled", false);
        d0.j("sessionSamplingRate", false);
        d0.j("sessionTimeoutSeconds", false);
        d0.j("cacheDurationSeconds", false);
        d0.j("cacheUpdatedTimeSeconds", false);
        descriptor = d0;
    }

    private SessionConfigs$$serializer() {
    }

    @Override // kotlinx.serialization.internal.M
    public final b<?>[] childSerializers() {
        b<?> c = a.c(C1141i.a);
        b<?> c2 = a.c(C.a);
        W w = W.a;
        return new b[]{c, c2, a.c(w), a.c(w), a.c(C1138g0.a)};
    }

    @Override // kotlinx.serialization.a
    public final SessionConfigs deserialize(e decoder) {
        int i;
        Boolean bool;
        Double d;
        Integer num;
        Integer num2;
        Long l;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f fVar = descriptor;
        c beginStructure = decoder.beginStructure(fVar);
        Boolean bool2 = null;
        if (beginStructure.decodeSequentially()) {
            Boolean bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(fVar, 0, C1141i.a, null);
            Double d2 = (Double) beginStructure.decodeNullableSerializableElement(fVar, 1, C.a, null);
            W w = W.a;
            Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 2, w, null);
            bool = bool3;
            num2 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 3, w, null);
            l = (Long) beginStructure.decodeNullableSerializableElement(fVar, 4, C1138g0.a, null);
            num = num3;
            d = d2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Double d3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Long l2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(fVar, 0, C1141i.a, bool2);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    d3 = (Double) beginStructure.decodeNullableSerializableElement(fVar, 1, C.a, d3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    num4 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 2, W.a, num4);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    num5 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 3, W.a, num5);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new s(decodeElementIndex);
                    }
                    l2 = (Long) beginStructure.decodeNullableSerializableElement(fVar, 4, C1138g0.a, l2);
                    i2 |= 16;
                }
            }
            i = i2;
            bool = bool2;
            d = d3;
            num = num4;
            num2 = num5;
            l = l2;
        }
        beginStructure.endStructure(fVar);
        return new SessionConfigs(i, bool, d, num, num2, l, null);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, SessionConfigs value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f fVar = descriptor;
        d beginStructure = encoder.beginStructure(fVar);
        SessionConfigs.write$Self$com_google_firebase_firebase_sessions(value, beginStructure, fVar);
        beginStructure.endStructure(fVar);
    }

    @Override // kotlinx.serialization.internal.M
    public b<?>[] typeParametersSerializers() {
        return F0.a;
    }
}
