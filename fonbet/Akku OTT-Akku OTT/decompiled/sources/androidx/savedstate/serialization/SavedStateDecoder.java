package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateReader;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.modules.d;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!H\u0002¢\u0006\u0004\b\"\u0010#J%\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020)H\u0016¢\u0006\u0004\bG\u0010,J\u0017\u0010I\u001a\u00020H2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020-H\u0016¢\u0006\u0004\bK\u0010/J#\u0010L\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\bL\u0010(R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010PR$\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010ER\u0016\u0010U\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Landroidx/savedstate/serialization/SavedStateDecoder;", "Lkotlinx/serialization/encoding/a;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "", "", "decodeIntList", "()Ljava/util/List;", "", "decodeStringList", "", "decodeBooleanArray", "()[Z", "", "decodeCharArray", "()[C", "", "decodeDoubleArray", "()[D", "", "decodeFloatArray", "()[F", "", "decodeIntArray", "()[I", "", "decodeLongArray", "()[J", "", "decodeStringArray", "()[Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/a;", "deserializer", "decodeFormatSpecificTypes", "(Lkotlinx/serialization/a;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/f;", "descriptor", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/f;)I", "", "decodeBoolean", "()Z", "", "decodeByte", "()B", "", "decodeShort", "()S", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "decodeString", "()Ljava/lang/String;", "enumDescriptor", "decodeEnum", "Lkotlinx/serialization/encoding/c;", "beginStructure", "(Lkotlinx/serialization/descriptors/f;)Lkotlinx/serialization/encoding/c;", "decodeNotNullMark", "decodeSerializableValue", "Landroid/os/Bundle;", "getSavedState$savedstate_release", "()Landroid/os/Bundle;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "value", Constants.KEY, "Ljava/lang/String;", "getKey$savedstate_release", FirebaseAnalytics.Param.INDEX, "I", "Lkotlinx/serialization/modules/d;", "serializersModule", "Lkotlinx/serialization/modules/d;", "getSerializersModule", "()Lkotlinx/serialization/modules/d;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateDecoder.kt\nandroidx/savedstate/serialization/SavedStateDecoder\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,215:1\n90#2:216\n90#2:217\n90#2:218\n90#2:219\n90#2:220\n90#2:221\n90#2:222\n90#2:223\n90#2:224\n90#2:225\n90#2:226\n90#2:227\n90#2:228\n90#2:229\n90#2:230\n90#2:231\n90#2:232\n90#2:233\n90#2:234\n90#2:235\n90#2:236\n90#2:237\n90#2:238\n*S KotlinDebug\n*F\n+ 1 SavedStateDecoder.kt\nandroidx/savedstate/serialization/SavedStateDecoder\n*L\n92#1:216\n116#1:217\n118#1:218\n120#1:219\n122#1:220\n124#1:221\n126#1:222\n128#1:223\n130#1:224\n132#1:225\n134#1:226\n137#1:227\n141#1:228\n145#1:229\n149#1:230\n153#1:231\n157#1:232\n161#1:233\n165#1:234\n169#1:235\n177#1:236\n184#1:237\n100#1:238\n*E\n"})
/* loaded from: classes3.dex */
public final class SavedStateDecoder extends kotlinx.serialization.encoding.a {
    private final SavedStateConfiguration configuration;
    private int index;
    private String key;
    private final Bundle savedState;
    private final d serializersModule;

    public SavedStateDecoder(Bundle savedState, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final boolean[] decodeBooleanArray() {
        return SavedStateReader.m1527getBooleanArrayimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    private final char[] decodeCharArray() {
        return SavedStateReader.m1531getCharArrayimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    private final double[] decodeDoubleArray() {
        return SavedStateReader.m1541getDoubleArrayimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    private static final boolean decodeElementIndex$presentInEncoding(SavedStateDecoder savedStateDecoder, f fVar, int i) {
        return SavedStateReader.m1518containsimpl(SavedStateReader.m1517constructorimpl(savedStateDecoder.savedState), fVar.e(i));
    }

    private final float[] decodeFloatArray() {
        return SavedStateReader.m1545getFloatArrayimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T decodeFormatSpecificTypes(kotlinx.serialization.a<? extends T> deserializer) {
        T t = (T) SavedStateDecoder_androidKt.decodeFormatSpecificTypesOnPlatform(this, deserializer);
        if (t != null) {
            return t;
        }
        f descriptor = deserializer.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            return (T) decodeIntList();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            return (T) decodeStringList();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            return (T) decodeBooleanArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            return (T) decodeCharArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            return (T) decodeDoubleArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            return (T) decodeFloatArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            return (T) decodeIntArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            return (T) decodeLongArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return (T) decodeStringArray();
        }
        return null;
    }

    private final int[] decodeIntArray() {
        return SavedStateReader.m1549getIntArrayimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    private final List<Integer> decodeIntList() {
        return SavedStateReader.m1551getIntListimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    private final long[] decodeLongArray() {
        return SavedStateReader.m1559getLongArrayimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    private final String[] decodeStringArray() {
        return SavedStateReader.m1589getStringArrayimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    private final List<String> decodeStringList() {
        return SavedStateReader.m1591getStringListimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public c beginStructure(f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Intrinsics.areEqual(this.key, "") ? this : new SavedStateDecoder(SavedStateReader.m1574getSavedStateimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key), this.configuration);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public boolean decodeBoolean() {
        return SavedStateReader.m1526getBooleanimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public byte decodeByte() {
        return (byte) SavedStateReader.m1548getIntimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public char decodeChar() {
        return SavedStateReader.m1530getCharimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public double decodeDouble() {
        return SavedStateReader.m1540getDoubleimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.c
    public int decodeElementIndex(f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int m1597sizeimpl = (Intrinsics.areEqual(descriptor.getKind(), n.b.a) || Intrinsics.areEqual(descriptor.getKind(), n.c.a)) ? SavedStateReader.m1597sizeimpl(SavedStateReader.m1517constructorimpl(this.savedState)) : descriptor.d();
        while (true) {
            int i = this.index;
            if (i >= m1597sizeimpl || !descriptor.i(i) || decodeElementIndex$presentInEncoding(this, descriptor, this.index)) {
                break;
            }
            this.index++;
        }
        int i2 = this.index;
        if (i2 >= m1597sizeimpl) {
            return -1;
        }
        this.key = descriptor.e(i2);
        int i3 = this.index;
        this.index = i3 + 1;
        return i3;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public int decodeEnum(f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return SavedStateReader.m1548getIntimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public float decodeFloat() {
        return SavedStateReader.m1544getFloatimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public int decodeInt() {
        return SavedStateReader.m1548getIntimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public long decodeLong() {
        return SavedStateReader.m1558getLongimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public boolean decodeNotNullMark() {
        return !SavedStateReader.m1596isNullimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public <T> T decodeSerializableValue(kotlinx.serialization.a<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        T t = (T) decodeFormatSpecificTypes(deserializer);
        return t == null ? (T) super.decodeSerializableValue(deserializer) : t;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public short decodeShort() {
        return (short) SavedStateReader.m1548getIntimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public String decodeString() {
        return SavedStateReader.m1588getStringimpl(SavedStateReader.m1517constructorimpl(this.savedState), this.key);
    }

    /* renamed from: getKey$savedstate_release, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: getSavedState$savedstate_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @Override // kotlinx.serialization.encoding.c
    public d getSerializersModule() {
        return this.serializersModule;
    }
}
