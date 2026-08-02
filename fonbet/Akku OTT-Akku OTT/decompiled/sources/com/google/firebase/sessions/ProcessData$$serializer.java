package com.google.firebase.sessions;

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
import kotlinx.serialization.internal.S0;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.s;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/ProcessData.$serializer", "Lkotlinx/serialization/internal/M;", "Lcom/google/firebase/sessions/ProcessData;", "<init>", "()V", "Lkotlinx/serialization/encoding/f;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/f;Lcom/google/firebase/sessions/ProcessData;)V", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/e;)Lcom/google/firebase/sessions/ProcessData;", "", "Lkotlinx/serialization/b;", "childSerializers", "()[Lkotlinx/serialization/b;", "Lkotlinx/serialization/descriptors/f;", "descriptor", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public /* synthetic */ class ProcessData$$serializer implements M<ProcessData> {
    public static final ProcessData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ProcessData$$serializer processData$$serializer = new ProcessData$$serializer();
        INSTANCE = processData$$serializer;
        D0 d0 = new D0("com.google.firebase.sessions.ProcessData", processData$$serializer, 2);
        d0.j("pid", false);
        d0.j("uuid", false);
        descriptor = d0;
    }

    private ProcessData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.M
    public final kotlinx.serialization.b<?>[] childSerializers() {
        return new kotlinx.serialization.b[]{W.a, S0.a};
    }

    @Override // kotlinx.serialization.a
    public final ProcessData deserialize(e decoder) {
        int i;
        String str;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f fVar = descriptor;
        kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
        if (beginStructure.decodeSequentially()) {
            i = beginStructure.decodeIntElement(fVar, 0);
            str = beginStructure.decodeStringElement(fVar, 1);
            i2 = 3;
        } else {
            boolean z = true;
            i = 0;
            int i3 = 0;
            String str2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    i = beginStructure.decodeIntElement(fVar, 0);
                    i3 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new s(decodeElementIndex);
                    }
                    str2 = beginStructure.decodeStringElement(fVar, 1);
                    i3 |= 2;
                }
            }
            str = str2;
            i2 = i3;
        }
        beginStructure.endStructure(fVar);
        return new ProcessData(i2, i, str, null);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, ProcessData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f fVar = descriptor;
        d beginStructure = encoder.beginStructure(fVar);
        ProcessData.write$Self$com_google_firebase_firebase_sessions(value, beginStructure, fVar);
        beginStructure.endStructure(fVar);
    }

    @Override // kotlinx.serialization.internal.M
    public kotlinx.serialization.b<?>[] typeParametersSerializers() {
        return F0.a;
    }
}
