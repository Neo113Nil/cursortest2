package androidx.compose.runtime;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.StarRating;

/* renamed from: androidx.compose.runtime.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0211b implements Bundleable.Creator {
    public static String a(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        StarRating fromBundle;
        fromBundle = StarRating.fromBundle(bundle);
        return fromBundle;
    }
}
