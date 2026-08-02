package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.core.view.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5312d0 extends AbstractC7737t implements Function1<View, Iterator<? extends View>> {

    /* renamed from: b, reason: collision with root package name */
    public static final C5312d0 f42290b = new C5312d0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<? extends View> invoke(View view) {
        View view2 = view;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            return new C5314e0(viewGroup);
        }
        return null;
    }
}
