package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class N extends AbstractC7737t implements Function1<Resources, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final N f36943b = new N(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Resources resources) {
        Resources resources2 = resources;
        Intrinsics.checkNotNullParameter(resources2, "resources");
        return Boolean.valueOf((resources2.getConfiguration().uiMode & 48) == 32);
    }
}
