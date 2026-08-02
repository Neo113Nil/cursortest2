package T50;

import android.content.Context;
import android.content.Intent;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import i3.C7003a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.badge.ExternalBadgeCallback$BadgeState;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26670a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter<ExternalBadgeCallback$BadgeState> f26671b;

    public a(@NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f26670a = context;
        this.f26671b = moshi.c(ExternalBadgeCallback$BadgeState.class);
    }

    public final void a(@NotNull String count, boolean z11) {
        Intrinsics.checkNotNullParameter(count, "count");
        String json = this.f26671b.toJson(new ExternalBadgeCallback$BadgeState(z11, count));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        Intent intent = new Intent("ru.ozon.fintech.TAB_MESSAGE");
        intent.putExtra("extra_message_data", json);
        C7003a.b(this.f26670a).d(intent);
    }
}
