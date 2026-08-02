package kotlin.reflect.jvm.internal.impl.metadata.serialization;

/* loaded from: classes17.dex */
public abstract class MutableTable<Element extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<?, Element>, Table extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, TableBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Table, TableBuilder>> {
    private final kotlin.reflect.jvm.internal.impl.metadata.serialization.Interner<kotlin.reflect.jvm.internal.impl.metadata.serialization.TableElementWrapper<Element>> getHighSpeedVideoFpsRanges;

    public final int get(Element element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return this.getHighSpeedVideoFpsRanges.intern(new kotlin.reflect.jvm.internal.impl.metadata.serialization.TableElementWrapper<>(element));
    }
}
