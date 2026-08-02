package androidx.fragment.app;

import android.view.View;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5389j extends AbstractC7737t implements Function1<Map.Entry<String, View>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Collection<String> f43115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5389j(Collection<String> collection) {
        super(1);
        this.f43115b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        Intrinsics.checkNotNullParameter(entry2, "entry");
        return Boolean.valueOf(C7714v.A(this.f43115b, androidx.core.view.Y.o(entry2.getValue())));
    }
}
