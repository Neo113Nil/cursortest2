package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class RenderingFormat {
    public static final kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat HTML;
    public static final kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat PLAIN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] getHighSpeedVideoSizes;

    public abstract java.lang.String escape(java.lang.String str);

    private RenderingFormat(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat renderingFormat = new kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat("PLAIN") { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
            {
                int i = 0;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
            public final java.lang.String escape(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                return str;
            }
        };
        PLAIN = renderingFormat;
        kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat renderingFormat2 = new kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat("HTML") { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
            {
                int i = 1;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
            public final java.lang.String escape(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                return kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, "<", "&lt;", false, 4, (java.lang.Object) null), ">", "&gt;", false, 4, (java.lang.Object) null);
            }
        };
        HTML = renderingFormat2;
        kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] renderingFormatArr = {renderingFormat, renderingFormat2};
        getHighSpeedVideoSizes = renderingFormatArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(renderingFormatArr);
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] values() {
        return (kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.class, str);
    }

    public /* synthetic */ RenderingFormat(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }
}
