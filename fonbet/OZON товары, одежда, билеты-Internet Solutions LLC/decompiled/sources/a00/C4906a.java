package a00;

import androidx.lifecycle.B0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity;

/* renamed from: a00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4906a implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PlayStoriesActivity f36117a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PlayStoriesActivity f36118b;

    public C4906a(PlayStoriesActivity viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "activity");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "sharedViewModelStoreOwner");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f36117a = viewModelStoreOwner;
        this.f36118b = viewModelStoreOwner;
    }

    @Override // a00.h
    @NotNull
    public final B0 a() {
        return this.f36118b;
    }

    @Override // a00.h
    @NotNull
    public final B0 b() {
        return this.f36117a;
    }
}
