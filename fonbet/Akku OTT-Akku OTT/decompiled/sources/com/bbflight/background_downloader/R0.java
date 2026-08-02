package com.bbflight.background_downloader;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Models.kt\ncom/bbflight/background_downloader/TaskExceptionSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,619:1\n475#2,4:620\n570#3,4:624\n297#4,8:628\n297#4,8:636\n297#4,8:644\n*S KotlinDebug\n*F\n+ 1 Models.kt\ncom/bbflight/background_downloader/TaskExceptionSerializer\n*L\n542#1:620,4\n559#1:624,4\n536#1:628,8\n537#1:636,8\n538#1:644,8\n*E\n"})
/* loaded from: classes3.dex */
public final class R0 implements kotlinx.serialization.b<P0> {
    public static final R0 a = new R0();
    public static final kotlinx.serialization.descriptors.i b = kotlinx.serialization.descriptors.l.b("TaskException", new kotlinx.serialization.descriptors.f[0], new Q0());

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.i iVar = b;
        kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(iVar);
        W w = null;
        String str = "";
        int i = -1;
        while (true) {
            int decodeElementIndex = beginStructure.decodeElementIndex(iVar);
            if (decodeElementIndex == -1) {
                Intrinsics.checkNotNull(w);
                P0 p0 = new P0(w, i, str);
                beginStructure.endStructure(iVar);
                return p0;
            }
            if (decodeElementIndex == 0) {
                String decodeStringElement = beginStructure.decodeStringElement(iVar, 0);
                switch (decodeStringElement.hashCode()) {
                    case -1620706755:
                        if (!decodeStringElement.equals("TaskResumeException")) {
                            w = W.b;
                            break;
                        } else {
                            w = W.f;
                            break;
                        }
                    case -1014773793:
                        if (!decodeStringElement.equals("TaskFileSystemException")) {
                            w = W.b;
                            break;
                        } else {
                            w = W.c;
                            break;
                        }
                    case -858000084:
                        if (!decodeStringElement.equals("TaskConnectionException")) {
                            w = W.b;
                            break;
                        } else {
                            w = W.e;
                            break;
                        }
                    case -235502107:
                        if (!decodeStringElement.equals("TaskUrlException")) {
                            w = W.b;
                            break;
                        } else {
                            w = W.d;
                            break;
                        }
                    case 1847794434:
                        if (!decodeStringElement.equals("TaskHttpException")) {
                            w = W.b;
                            break;
                        } else {
                            w = W.i;
                            break;
                        }
                    default:
                        w = W.b;
                        break;
                }
            } else if (decodeElementIndex == 1) {
                i = beginStructure.decodeIntElement(iVar, 1);
            } else {
                if (decodeElementIndex != 2) {
                    throw new IllegalStateException(("Unexpected index: " + decodeElementIndex).toString());
                }
                str = beginStructure.decodeStringElement(iVar, 2);
            }
        }
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        P0 value = (P0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.i iVar = b;
        kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(iVar);
        int ordinal = value.a.ordinal();
        beginStructure.encodeStringElement(iVar, 0, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "TaskException" : "TaskHttpException" : "TaskResumeException" : "TaskConnectionException" : "TaskUrlException" : "TaskFileSystemException");
        beginStructure.encodeIntElement(iVar, 1, value.b);
        beginStructure.encodeStringElement(iVar, 2, value.c);
        beginStructure.endStructure(iVar);
    }
}
