package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public class JvmDescriptorTypeWriter<T> {
    private T getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> getHighSpeedVideoSizes;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRangesFor++;
        }
    }

    public void writeClass(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        writeJvmTypeAsIs(t);
    }

    protected final void writeJvmTypeAsIs(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        if (this.getHighSpeedVideoFpsRanges == null) {
            if (this.getHighSpeedVideoFpsRangesFor > 0) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> jvmTypeFactory = this.getHighSpeedVideoSizes;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(kotlin.text.StringsKt.repeat("[", this.getHighSpeedVideoFpsRangesFor));
                sb.append(this.getHighSpeedVideoSizes.toString(t));
                t = jvmTypeFactory.createFromString(sb.toString());
            }
            this.getHighSpeedVideoFpsRanges = t;
        }
    }

    public void writeTypeVariable(kotlin.reflect.jvm.internal.impl.name.Name name2, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        writeJvmTypeAsIs(t);
    }
}
