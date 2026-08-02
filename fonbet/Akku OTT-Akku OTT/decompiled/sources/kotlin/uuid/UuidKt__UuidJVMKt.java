package kotlin.uuid;

import android.support.v4.media.a;
import androidx.collection.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.IgnorableReturnValue;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0080\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0081\u0080\u0004\u001a\u0016\u0010\b\u001a\u00020\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0081\u0080\u0004\u001a.\u0010\f\u001a\u00020\u0001*\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0081\u0080\u0004\u001a\u001e\u0010\u0011\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0081\u0080\u0004\u001a\u0012\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0081\u0080\u0004\u001a\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0081\u0080\u0004\u001a\u0012\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0015H\u0081\u0080\u0004\u001a\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0015H\u0081\u0080\u0004\u001a\u000e\u0010\u001a\u001a\u00020\u0007*\u00020\u001bH\u0087\u0088\u0004\u001a\u000e\u0010\u001c\u001a\u00020\u001b*\u00020\u0007H\u0087\u0088\u0004\u001a\u000e\u0010\u001d\u001a\u00020\u0007*\u00020\u001eH\u0087\u0080\u0004\u001a\u0016\u0010\u001d\u001a\u00020\u0007*\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000bH\u0087\u0080\u0004\u001a\u0016\u0010\u001f\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0087\u0080\b\u001a\u001e\u0010\u001f\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0087\u0080\b\u001a\u000e\u0010 \u001a\u00020\t*\u00020\tH\u0080\u0088\u0004¨\u0006!"}, d2 = {"secureRandomBytes", "", FirebaseAnalytics.Param.DESTINATION, "", "serializedUuid", "", "uuid", "Lkotlin/uuid/Uuid;", "getLongAt", "", FirebaseAnalytics.Param.INDEX, "", "formatBytesInto", "dst", "dstOffset", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "setLongAt", "value", "uuidParseHexDash", "hexDashString", "", "uuidParseHexDashOrNull", "uuidParseHex", "hexString", "uuidParseHexOrNull", "toKotlinUuid", "Ljava/util/UUID;", "toJavaUuid", "getUuid", "Ljava/nio/ByteBuffer;", "putUuid", "reverseBytes", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,285:1\n284#1:286\n284#1:287\n284#1:288\n284#1:289\n284#1:290\n284#1:291\n284#1:292\n284#1:293\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n144#1:286\n145#1:287\n189#1:288\n190#1:289\n230#1:290\n231#1:291\n278#1:292\n279#1:293\n*E\n"})
/* loaded from: classes5.dex */
class UuidKt__UuidJVMKt {
    @ExperimentalUuidApi
    public static final void formatBytesInto(long j, byte[] dst, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        UuidKt__UuidKt.formatBytesIntoCommonImpl(j, dst, i, i2, i3);
    }

    @ExperimentalUuidApi
    public static final long getLongAt(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return UuidKt__UuidKt.getLongAtCommonImpl(bArr, i);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid getUuid(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            j = Long.reverseBytes(j);
            j2 = Long.reverseBytes(j2);
        }
        return Uuid.INSTANCE.fromLongs(j, j2);
    }

    @SinceKotlin(version = "2.0")
    @IgnorableReturnValue
    @ExperimentalUuidApi
    public static final ByteBuffer putUuid(ByteBuffer byteBuffer, Uuid uuid) {
        ByteBuffer putLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            putLong = byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(Long.reverseBytes(mostSignificantBits));
            putLong = byteBuffer.putLong(Long.reverseBytes(leastSignificantBits));
        }
        Intrinsics.checkNotNullExpressionValue(putLong, "toLongs(...)");
        return putLong;
    }

    public static final long reverseBytes(long j) {
        return Long.reverseBytes(j);
    }

    public static final void secureRandomBytes(byte[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        SecureRandomHolder.INSTANCE.getInstance().nextBytes(destination);
    }

    @ExperimentalUuidApi
    public static final Object serializedUuid(Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @ExperimentalUuidApi
    public static final void setLongAt(byte[] bArr, int i, long j) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        UuidKt__UuidKt.setLongAtCommonImpl(bArr, i, j);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final UUID toJavaUuid(Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return new UUID(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid toKotlinUuid(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return Uuid.INSTANCE.fromLongs(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @ExperimentalUuidApi
    public static final Uuid uuidParseHex(String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return UuidKt__UuidKt.uuidParseHexCommonImpl(hexString);
    }

    @ExperimentalUuidApi
    public static final Uuid uuidParseHexDash(String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        return UuidKt__UuidKt.uuidParseHexDashCommonImpl(hexDashString);
    }

    @ExperimentalUuidApi
    public static final Uuid uuidParseHexDashOrNull(String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        return UuidKt__UuidKt.uuidParseHexDashOrNullCommonImpl(hexDashString);
    }

    @ExperimentalUuidApi
    public static final Uuid uuidParseHexOrNull(String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return UuidKt__UuidKt.uuidParseHexOrNullCommonImpl(hexString);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid getUuid(ByteBuffer byteBuffer, int i) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (i >= 0) {
            if (i + 15 < byteBuffer.limit()) {
                long j = byteBuffer.getLong(i);
                long j2 = byteBuffer.getLong(i + 8);
                if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                    j = Long.reverseBytes(j);
                    j2 = Long.reverseBytes(j2);
                }
                return Uuid.INSTANCE.fromLongs(j, j2);
            }
            StringBuilder c = g.c(i, "Not enough bytes to read a uuid at index: ", ", with limit: ");
            c.append(byteBuffer.limit());
            c.append(' ');
            throw new IndexOutOfBoundsException(c.toString());
        }
        throw new IndexOutOfBoundsException(a.a(i, "Negative index: "));
    }

    @SinceKotlin(version = "2.0")
    @IgnorableReturnValue
    @ExperimentalUuidApi
    public static final ByteBuffer putUuid(ByteBuffer byteBuffer, int i, Uuid uuid) {
        ByteBuffer putLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (i >= 0) {
            if (i + 15 < byteBuffer.limit()) {
                if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                    byteBuffer.putLong(i, mostSignificantBits);
                    putLong = byteBuffer.putLong(i + 8, leastSignificantBits);
                } else {
                    byteBuffer.putLong(i, Long.reverseBytes(mostSignificantBits));
                    putLong = byteBuffer.putLong(i + 8, Long.reverseBytes(leastSignificantBits));
                }
                Intrinsics.checkNotNullExpressionValue(putLong, "toLongs(...)");
                return putLong;
            }
            StringBuilder c = g.c(i, "Not enough capacity to write a uuid at index: ", ", with limit: ");
            c.append(byteBuffer.limit());
            c.append(' ');
            throw new IndexOutOfBoundsException(c.toString());
        }
        throw new IndexOutOfBoundsException(a.a(i, "Negative index: "));
    }
}
