package c2;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: c2.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5731e extends AbstractC7737t implements Function0<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5732f<View> f56376b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5731e(C5732f<View> c5732f) {
        super(0);
        this.f56376b = c5732f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ((C5732f) this.f56376b).f56380x.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
