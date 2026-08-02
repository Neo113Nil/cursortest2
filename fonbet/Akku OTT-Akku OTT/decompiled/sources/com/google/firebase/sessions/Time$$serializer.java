package com.google.firebase.sessions;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.C1138g0;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.internal.F0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.s;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/Time.$serializer", "Lkotlinx/serialization/internal/M;", "Lcom/google/firebase/sessions/Time;", "<init>", "()V", "Lkotlinx/serialization/encoding/f;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/f;Lcom/google/firebase/sessions/Time;)V", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/e;)Lcom/google/firebase/sessions/Time;", "", "Lkotlinx/serialization/b;", "childSerializers", "()[Lkotlinx/serialization/b;", "Lkotlinx/serialization/descriptors/f;", "descriptor", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public /* synthetic */ class Time$$serializer implements M<Time> {
    public static final Time$$serializer INSTANCE;
    private static final f descriptor;

    static {
        Time$$serializer time$$serializer = new Time$$serializer();
        INSTANCE = time$$serializer;
        D0 d0 = new D0("com.google.firebase.sessions.Time", time$$serializer, 3);
        d0.j("ms", false);
        d0.j("us", true);
        d0.j("seconds", true);
        descriptor = d0;
    }

    private Time$$serializer() {
    }

    @Override // kotlinx.serialization.internal.M
    public final kotlinx.serialization.b<?>[] childSerializers() {
        C1138g0 c1138g0 = C1138g0.a;
        return new kotlinx.serialization.b[]{c1138g0, c1138g0, c1138g0};
    }

    @Override // kotlinx.serialization.a
    public final Time deserialize(e decoder) {
        int i;
        long j;
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f fVar = descriptor;
        kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
            long decodeLongElement2 = beginStructure.decodeLongElement(fVar, 1);
            j = beginStructure.decodeLongElement(fVar, 2);
            i = 7;
            j2 = decodeLongElement;
            j3 = decodeLongElement2;
        } else {
            long j4 = 0;
            boolean z = true;
            int i2 = 0;
            long j5 = 0;
            long j6 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    j5 = beginStructure.decodeLongElement(fVar, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    j6 = beginStructure.decodeLongElement(fVar, 1);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new s(decodeElementIndex);
                    }
                    j4 = beginStructure.decodeLongElement(fVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            j = j4;
            j2 = j5;
            j3 = j6;
        }
        beginStructure.endStructure(fVar);
        return new Time(i, j2, j3, j, null);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Time value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f fVar = descriptor;
        d beginStructure = encoder.beginStructure(fVar);
        Time.write$Self$com_google_firebase_firebase_sessions(value, beginStructure, fVar);
        beginStructure.endStructure(fVar);
    }

    @Override // kotlinx.serialization.internal.M
    public kotlinx.serialization.b<?>[] typeParametersSerializers() {
        return F0.a;
    }
}
