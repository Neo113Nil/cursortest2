package L1;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class P {
    public static final boolean a(@NotNull StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(@NotNull StaticLayout.Builder builder, int i11, int i12) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = O.a().setLineBreakStyle(i11);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i12);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
