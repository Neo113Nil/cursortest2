package b60;

import U50.j;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts.ReadContactsAvailableData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import t90.AbstractC9782b;

/* renamed from: b60.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5569d implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    private final r90.f f55564a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f55565b;

    public C5569d(@NotNull Moshi moshi, r90.f fVar) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f55564a = fVar;
        this.f55565b = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "is_contacts_available";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String str;
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r parentFragmentActivity = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        boolean z11 = false;
        if (parentFragmentActivity != null) {
            r90.f fVar = this.f55564a;
            AbstractC9782b h11 = fVar != null ? fVar.h(parentFragmentActivity) : null;
            if ((h11 instanceof AbstractC9782b.a) || (h11 instanceof AbstractC9782b.c)) {
                z11 = true;
            }
        }
        try {
            str = this.f55565b.c(ReadContactsAvailableData.class).toJson(new ReadContactsAvailableData(z11));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        ((j) callback).invoke(new NativeResult.Success(str));
    }
}
