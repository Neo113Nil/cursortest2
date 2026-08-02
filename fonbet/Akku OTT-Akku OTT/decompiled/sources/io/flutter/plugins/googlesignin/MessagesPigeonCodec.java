package io.flutter.plugins.googlesignin;

import androidx.media3.extractor.ts.TsExtractor;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/googlesignin/MessagesPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "readValueOfType", "", "type", "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", "value", "google_sign_in_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Messages.kt\nio/flutter/plugins/googlesignin/MessagesPigeonCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,827:1\n1#2:828\n*E\n"})
/* loaded from: classes3.dex */
class MessagesPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte type, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (type == -127) {
            Long l = (Long) readValue(buffer);
            if (l != null) {
                return GetCredentialFailureType.INSTANCE.ofRaw((int) l.longValue());
            }
            return null;
        }
        if (type == -126) {
            Long l2 = (Long) readValue(buffer);
            if (l2 != null) {
                return AuthorizeFailureType.INSTANCE.ofRaw((int) l2.longValue());
            }
            return null;
        }
        if (type == -125) {
            Object readValue = readValue(buffer);
            List<? extends Object> list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return PlatformAuthorizationRequest.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -124) {
            Object readValue2 = readValue(buffer);
            List<? extends Object> list2 = readValue2 instanceof List ? (List) readValue2 : null;
            if (list2 != null) {
                return GetCredentialRequestParams.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -123) {
            Object readValue3 = readValue(buffer);
            List<? extends Object> list3 = readValue3 instanceof List ? (List) readValue3 : null;
            if (list3 != null) {
                return GetCredentialRequestGoogleIdOptionParams.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type == -122) {
            Object readValue4 = readValue(buffer);
            List<? extends Object> list4 = readValue4 instanceof List ? (List) readValue4 : null;
            if (list4 != null) {
                return PlatformRevokeAccessRequest.INSTANCE.fromList(list4);
            }
            return null;
        }
        if (type == -121) {
            Object readValue5 = readValue(buffer);
            List<? extends Object> list5 = readValue5 instanceof List ? (List) readValue5 : null;
            if (list5 != null) {
                return PlatformGoogleIdTokenCredential.INSTANCE.fromList(list5);
            }
            return null;
        }
        if (type == -120) {
            Object readValue6 = readValue(buffer);
            List<? extends Object> list6 = readValue6 instanceof List ? (List) readValue6 : null;
            if (list6 != null) {
                return GetCredentialFailure.INSTANCE.fromList(list6);
            }
            return null;
        }
        if (type == -119) {
            Object readValue7 = readValue(buffer);
            List<? extends Object> list7 = readValue7 instanceof List ? (List) readValue7 : null;
            if (list7 != null) {
                return GetCredentialSuccess.INSTANCE.fromList(list7);
            }
            return null;
        }
        if (type == -118) {
            Object readValue8 = readValue(buffer);
            List<? extends Object> list8 = readValue8 instanceof List ? (List) readValue8 : null;
            if (list8 != null) {
                return AuthorizeFailure.INSTANCE.fromList(list8);
            }
            return null;
        }
        if (type != -117) {
            return super.readValueOfType(type, buffer);
        }
        Object readValue9 = readValue(buffer);
        List<? extends Object> list9 = readValue9 instanceof List ? (List) readValue9 : null;
        if (list9 != null) {
            return PlatformAuthorizationResult.INSTANCE.fromList(list9);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object value) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (value instanceof GetCredentialFailureType) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((GetCredentialFailureType) value).getRaw()));
            return;
        }
        if (value instanceof AuthorizeFailureType) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((AuthorizeFailureType) value).getRaw()));
            return;
        }
        if (value instanceof PlatformAuthorizationRequest) {
            stream.write(131);
            writeValue(stream, ((PlatformAuthorizationRequest) value).toList());
            return;
        }
        if (value instanceof GetCredentialRequestParams) {
            stream.write(132);
            writeValue(stream, ((GetCredentialRequestParams) value).toList());
            return;
        }
        if (value instanceof GetCredentialRequestGoogleIdOptionParams) {
            stream.write(133);
            writeValue(stream, ((GetCredentialRequestGoogleIdOptionParams) value).toList());
            return;
        }
        if (value instanceof PlatformRevokeAccessRequest) {
            stream.write(134);
            writeValue(stream, ((PlatformRevokeAccessRequest) value).toList());
            return;
        }
        if (value instanceof PlatformGoogleIdTokenCredential) {
            stream.write(135);
            writeValue(stream, ((PlatformGoogleIdTokenCredential) value).toList());
            return;
        }
        if (value instanceof GetCredentialFailure) {
            stream.write(TsExtractor.TS_STREAM_TYPE_DTS_HD);
            writeValue(stream, ((GetCredentialFailure) value).toList());
            return;
        }
        if (value instanceof GetCredentialSuccess) {
            stream.write(137);
            writeValue(stream, ((GetCredentialSuccess) value).toList());
        } else if (value instanceof AuthorizeFailure) {
            stream.write(138);
            writeValue(stream, ((AuthorizeFailure) value).toList());
        } else if (!(value instanceof PlatformAuthorizationResult)) {
            super.writeValue(stream, value);
        } else {
            stream.write(TsExtractor.TS_STREAM_TYPE_DTS_UHD);
            writeValue(stream, ((PlatformAuthorizationResult) value).toList());
        }
    }
}
