package K80;

import android.location.Location;
import androidx.collection.C5132a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15368b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f15367a = i11;
        this.f15368b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15367a) {
            case 0:
                ((j) this.f15368b).a((Location) obj);
                return Unit.f71690a;
            default:
                return ru.ozon.android.messenger.framework.data.local.database.draft.i.n((ru.ozon.android.messenger.framework.data.local.database.draft.i) this.f15368b, (C5132a) obj);
        }
    }
}
