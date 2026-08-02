package android.support.v4.media;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.video.ColorInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Bundleable.Creator {
    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String c(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        ColorInfo lambda$static$0;
        lambda$static$0 = ColorInfo.lambda$static$0(bundle);
        return lambda$static$0;
    }
}
