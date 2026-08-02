package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.k;
import kotlinx.serialization.modules.d;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u00103J+\u00107\u001a\u00020\u0012\"\u0004\b\u0000\u001042\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000052\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b7\u00108J#\u0010:\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u00109\u001a\u00020)H\u0002¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0<H\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020)0<H\u0002¢\u0006\u0004\b?\u0010>J\u0017\u0010A\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020CH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020LH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u001d\u0010S\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020)0RH\u0002¢\u0006\u0004\bS\u0010TJ+\u0010U\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002¢\u0006\u0004\bU\u0010VJ+\u0010W\u001a\u00020\r\"\u0004\b\u0000\u001042\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000052\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\bW\u0010XR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\\R$\u0010]\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020)8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u00020a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006f"}, d2 = {"Landroidx/savedstate/serialization/SavedStateEncoder;", "Lkotlinx/serialization/encoding/b;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "Lkotlinx/serialization/descriptors/f;", "descriptor", "", FirebaseAnalytics.Param.INDEX, "", "shouldEncodeElementDefault", "(Lkotlinx/serialization/descriptors/f;I)Z", "encodeElement", "value", "", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "enumDescriptor", "encodeEnum", "(Lkotlinx/serialization/descriptors/f;I)V", "encodeNull", "()V", "Lkotlinx/serialization/encoding/d;", "beginStructure", "(Lkotlinx/serialization/descriptors/f;)Lkotlinx/serialization/encoding/d;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/k;", "serializer", "encodeSerializableValue", "(Lkotlinx/serialization/k;Ljava/lang/Object;)V", "elementName", "checkDiscriminatorCollisions", "(Landroid/os/Bundle;Ljava/lang/String;)V", "", "encodeIntList", "(Ljava/util/List;)V", "encodeStringList", "", "encodeBooleanArray", "([Z)V", "", "encodeCharArray", "([C)V", "", "encodeDoubleArray", "([D)V", "", "encodeFloatArray", "([F)V", "", "encodeIntArray", "([I)V", "", "encodeLongArray", "([J)V", "", "encodeStringArray", "([Ljava/lang/String;)V", "putClassDiscriminatorIfRequired", "(Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlinx/serialization/descriptors/f;Landroid/os/Bundle;)V", "encodeFormatSpecificTypes", "(Lkotlinx/serialization/k;Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "getSavedState$savedstate_release", "()Landroid/os/Bundle;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", Constants.KEY, "Ljava/lang/String;", "getKey$savedstate_release", "()Ljava/lang/String;", "Lkotlinx/serialization/modules/d;", "serializersModule", "Lkotlinx/serialization/modules/d;", "getSerializersModule", "()Lkotlinx/serialization/modules/d;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoder\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,281:1\n90#2:282\n90#2:283\n106#2:284\n106#2:285\n106#2:286\n106#2:287\n106#2:288\n106#2:289\n106#2:290\n106#2:291\n106#2:292\n106#2:293\n106#2:294\n106#2:295\n106#2:296\n106#2:297\n106#2:298\n106#2:299\n106#2:300\n106#2:301\n106#2:302\n106#2:303\n106#2:324\n106#2:326\n90#2:327\n106#2:328\n27#3:304\n46#3:305\n32#3,4:306\n31#3,7:316\n126#4:310\n153#4,3:311\n37#5,2:314\n1#6:323\n46#7:325\n*S KotlinDebug\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoder\n*L\n108#1:282\n111#1:283\n122#1:284\n126#1:285\n130#1:286\n134#1:287\n138#1:288\n142#1:289\n146#1:290\n150#1:291\n154#1:292\n158#1:293\n162#1:294\n166#1:295\n170#1:296\n174#1:297\n178#1:298\n182#1:299\n186#1:300\n190#1:301\n194#1:302\n198#1:303\n211#1:324\n212#1:326\n229#1:327\n234#1:328\n211#1:304\n211#1:305\n211#1:306,4\n211#1:316,7\n211#1:310\n211#1:311,3\n211#1:314,2\n211#1:323\n211#1:325\n*E\n"})
/* loaded from: classes3.dex */
public final class SavedStateEncoder extends kotlinx.serialization.encoding.b {
    private final SavedStateConfiguration configuration;
    private String key;
    private final Bundle savedState;
    private final d serializersModule;

    public SavedStateEncoder(Bundle savedState, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final void checkDiscriminatorCollisions(Bundle savedState, String elementName) {
        if (this.configuration.getClassDiscriminatorMode() == 1) {
            boolean m1518containsimpl = SavedStateReader.m1518containsimpl(SavedStateReader.m1517constructorimpl(savedState), "type");
            boolean areEqual = Intrinsics.areEqual(elementName, "type");
            if (m1518containsimpl && areEqual) {
                throw new IllegalArgumentException(androidx.core.database.a.d("SavedStateEncoder for ", SavedStateReader.m1588getStringimpl(SavedStateReader.m1517constructorimpl(savedState), "type"), " has property '", elementName, "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation."));
            }
        }
    }

    private final void encodeBooleanArray(boolean[] value) {
        SavedStateWriter.m1610putBooleanArrayimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeCharArray(char[] value) {
        SavedStateWriter.m1612putCharArrayimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeDoubleArray(double[] value) {
        SavedStateWriter.m1617putDoubleArrayimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeFloatArray(float[] value) {
        SavedStateWriter.m1619putFloatArrayimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> boolean encodeFormatSpecificTypes(k<? super T> serializer, T value) {
        if (SavedStateEncoder_androidKt.encodeFormatSpecificTypesOnPlatform(this, serializer, value)) {
            return true;
        }
        f descriptor = serializer.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            encodeIntList((List) value);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            encodeStringList((List) value);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.BooleanArray");
            encodeBooleanArray((boolean[]) value);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.CharArray");
            encodeCharArray((char[]) value);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.DoubleArray");
            encodeDoubleArray((double[]) value);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.FloatArray");
            encodeFloatArray((float[]) value);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.IntArray");
            encodeIntArray((int[]) value);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.LongArray");
            encodeLongArray((long[]) value);
            return true;
        }
        if (!Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return false;
        }
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        encodeStringArray((String[]) value);
        return true;
    }

    private final void encodeIntArray(int[] value) {
        SavedStateWriter.m1621putIntArrayimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeIntList(List<Integer> value) {
        SavedStateWriter.m1622putIntListimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeLongArray(long[] value) {
        SavedStateWriter.m1625putLongArrayimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeStringArray(String[] value) {
        SavedStateWriter.m1637putStringArrayimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeStringList(List<String> value) {
        SavedStateWriter.m1638putStringListimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    private final void putClassDiscriminatorIfRequired(SavedStateConfiguration configuration, f descriptor, Bundle savedState) {
        if (configuration.getClassDiscriminatorMode() == 1 && !SavedStateReader.m1518containsimpl(SavedStateReader.m1517constructorimpl(savedState), "type")) {
            if (Intrinsics.areEqual(descriptor.getKind(), n.a.a) || Intrinsics.areEqual(descriptor.getKind(), n.d.a)) {
                SavedStateWriter.m1636putStringimpl(SavedStateWriter.m1603constructorimpl(savedState), "type", descriptor.h());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public kotlinx.serialization.encoding.d beginStructure(f descriptor) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.areEqual(this.key, "")) {
            putClassDiscriminatorIfRequired(this.configuration, descriptor, this.savedState);
            return this;
        }
        Map emptyMap = MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(emptyMap.size());
            for (Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m1603constructorimpl(bundleOf);
        SavedStateWriter.m1630putSavedStateimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, bundleOf);
        putClassDiscriminatorIfRequired(this.configuration, descriptor, bundleOf);
        return new SavedStateEncoder(bundleOf, this.configuration);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeBoolean(boolean value) {
        SavedStateWriter.m1609putBooleanimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeByte(byte value) {
        SavedStateWriter.m1620putIntimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeChar(char value) {
        SavedStateWriter.m1611putCharimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeDouble(double value) {
        SavedStateWriter.m1616putDoubleimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean encodeElement(f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String e = descriptor.e(index);
        this.key = e;
        checkDiscriminatorCollisions(this.savedState, e);
        return true;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeEnum(f enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        SavedStateWriter.m1620putIntimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, index);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeFloat(float value) {
        SavedStateWriter.m1618putFloatimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeInt(int value) {
        SavedStateWriter.m1620putIntimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeLong(long value) {
        SavedStateWriter.m1624putLongimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeNull() {
        SavedStateWriter.m1626putNullimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public <T> void encodeSerializableValue(k<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeFormatSpecificTypes(serializer, value)) {
            return;
        }
        super.encodeSerializableValue(serializer, value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeShort(short value) {
        SavedStateWriter.m1620putIntimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SavedStateWriter.m1636putStringimpl(SavedStateWriter.m1603constructorimpl(this.savedState), this.key, value);
    }

    /* renamed from: getKey$savedstate_release, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: getSavedState$savedstate_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @Override // kotlinx.serialization.encoding.f
    public d getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public boolean shouldEncodeElementDefault(f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }
}
