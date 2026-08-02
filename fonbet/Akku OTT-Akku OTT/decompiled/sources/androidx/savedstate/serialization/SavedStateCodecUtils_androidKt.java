package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.f;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b&\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0002\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u0004\" \u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0002\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0012\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0004\" \u0010\u0016\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0002\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0017\u0010\u0004\" \u0010\u0019\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0002\u0012\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0004\"\u001a\u0010\u001c\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0004\"\u001a\u0010\u001e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u001a\u0010 \u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0004\"\u001a\u0010\"\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0004\"\u001a\u0010$\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004¨\u0006&"}, d2 = {"Lkotlinx/serialization/descriptors/f;", "polymorphicCharSequenceDescriptor", "Lkotlinx/serialization/descriptors/f;", "getPolymorphicCharSequenceDescriptor", "()Lkotlinx/serialization/descriptors/f;", "polymorphicParcelableDescriptor", "getPolymorphicParcelableDescriptor", "polymorphicJavaSerializableDescriptor", "getPolymorphicJavaSerializableDescriptor", "polymorphicIBinderDescriptor", "getPolymorphicIBinderDescriptor", "parcelableArrayDescriptor", "getParcelableArrayDescriptor", "getParcelableArrayDescriptor$annotations", "()V", "polymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor$annotations", "parcelableListDescriptor", "getParcelableListDescriptor", "polymorphicParcelableListDescriptor", "getPolymorphicParcelableListDescriptor", "charSequenceArrayDescriptor", "getCharSequenceArrayDescriptor", "getCharSequenceArrayDescriptor$annotations", "polymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor$annotations", "charSequenceListDescriptor", "getCharSequenceListDescriptor", "polymorphicCharSequenceListDescriptor", "getPolymorphicCharSequenceListDescriptor", "sparseParcelableArrayDescriptor", "getSparseParcelableArrayDescriptor", "polymorphicSparseParcelableArrayDescriptor", "getPolymorphicSparseParcelableArrayDescriptor", "nullablePolymorphicSparseParcelableArrayDescriptor", "getNullablePolymorphicSparseParcelableArrayDescriptor", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateCodecUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,67:1\n194#2:68\n194#2:69\n194#2:70\n194#2:71\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n*L\n42#1:68\n45#1:69\n52#1:70\n55#1:71\n*E\n"})
/* loaded from: classes3.dex */
public final class SavedStateCodecUtils_androidKt {
    private static final f charSequenceArrayDescriptor;
    private static final f charSequenceListDescriptor;
    private static final f nullablePolymorphicSparseParcelableArrayDescriptor;
    private static final f parcelableArrayDescriptor;
    private static final f parcelableListDescriptor;
    private static final f polymorphicCharSequenceArrayDescriptor;
    private static final f polymorphicCharSequenceListDescriptor;
    private static final f polymorphicParcelableArrayDescriptor;
    private static final f polymorphicParcelableListDescriptor;
    private static final f polymorphicSparseParcelableArrayDescriptor;
    private static final f sparseParcelableArrayDescriptor;
    private static final f polymorphicCharSequenceDescriptor = new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(CharSequence.class)).getDescriptor();
    private static final f polymorphicParcelableDescriptor = new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(Parcelable.class)).getDescriptor();
    private static final f polymorphicJavaSerializableDescriptor = new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(Serializable.class)).getDescriptor();
    private static final f polymorphicIBinderDescriptor = new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(IBinder.class)).getDescriptor();

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
        parcelableArrayDescriptor = kotlinx.serialization.builtins.a.a(Reflection.getOrCreateKotlinClass(Parcelable.class), defaultParcelableSerializer).c;
        polymorphicParcelableArrayDescriptor = kotlinx.serialization.builtins.a.a(Reflection.getOrCreateKotlinClass(Parcelable.class), new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(Parcelable.class))).c;
        parcelableListDescriptor = kotlinx.serialization.builtins.a.b(defaultParcelableSerializer).b;
        polymorphicParcelableListDescriptor = kotlinx.serialization.builtins.a.b(new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(Parcelable.class))).b;
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
        charSequenceArrayDescriptor = kotlinx.serialization.builtins.a.a(Reflection.getOrCreateKotlinClass(CharSequence.class), charSequenceSerializer).c;
        polymorphicCharSequenceArrayDescriptor = kotlinx.serialization.builtins.a.a(Reflection.getOrCreateKotlinClass(CharSequence.class), new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(CharSequence.class))).c;
        charSequenceListDescriptor = kotlinx.serialization.builtins.a.b(charSequenceSerializer).b;
        polymorphicCharSequenceListDescriptor = kotlinx.serialization.builtins.a.b(new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(CharSequence.class))).b;
        sparseParcelableArrayDescriptor = new SparseArraySerializer(defaultParcelableSerializer).getDescriptor();
        polymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        nullablePolymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(kotlinx.serialization.builtins.a.c(new kotlinx.serialization.f(Reflection.getOrCreateKotlinClass(Parcelable.class)))).getDescriptor();
    }

    public static final f getCharSequenceArrayDescriptor() {
        return charSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getCharSequenceArrayDescriptor$annotations() {
    }

    public static final f getCharSequenceListDescriptor() {
        return charSequenceListDescriptor;
    }

    public static final f getNullablePolymorphicSparseParcelableArrayDescriptor() {
        return nullablePolymorphicSparseParcelableArrayDescriptor;
    }

    public static final f getParcelableArrayDescriptor() {
        return parcelableArrayDescriptor;
    }

    public static /* synthetic */ void getParcelableArrayDescriptor$annotations() {
    }

    public static final f getParcelableListDescriptor() {
        return parcelableListDescriptor;
    }

    public static final f getPolymorphicCharSequenceArrayDescriptor() {
        return polymorphicCharSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicCharSequenceArrayDescriptor$annotations() {
    }

    public static final f getPolymorphicCharSequenceDescriptor() {
        return polymorphicCharSequenceDescriptor;
    }

    public static final f getPolymorphicCharSequenceListDescriptor() {
        return polymorphicCharSequenceListDescriptor;
    }

    public static final f getPolymorphicIBinderDescriptor() {
        return polymorphicIBinderDescriptor;
    }

    public static final f getPolymorphicJavaSerializableDescriptor() {
        return polymorphicJavaSerializableDescriptor;
    }

    public static final f getPolymorphicParcelableArrayDescriptor() {
        return polymorphicParcelableArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicParcelableArrayDescriptor$annotations() {
    }

    public static final f getPolymorphicParcelableDescriptor() {
        return polymorphicParcelableDescriptor;
    }

    public static final f getPolymorphicParcelableListDescriptor() {
        return polymorphicParcelableListDescriptor;
    }

    public static final f getPolymorphicSparseParcelableArrayDescriptor() {
        return polymorphicSparseParcelableArrayDescriptor;
    }

    public static final f getSparseParcelableArrayDescriptor() {
        return sparseParcelableArrayDescriptor;
    }
}
