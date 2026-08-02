package org.betup.ui.fragment.tutorial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import io.github.dreierf.materialintroscreen.SlideFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: CustomLayoutIntroFragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/fragment/tutorial/CustomLayoutIntroFragment;", "Lio/github/dreierf/materialintroscreen/SlideFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "buttonsColor", "canMoveFurther", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomLayoutIntroFragment extends SlideFragment {
    public static final String layoutIdKey = "layoutId";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // io.github.dreierf.materialintroscreen.SlideFragment
    public int backgroundColor() {
        return R.color.intro_back;
    }

    @Override // io.github.dreierf.materialintroscreen.SlideFragment
    public int buttonsColor() {
        return R.color.button_intro;
    }

    @Override // io.github.dreierf.materialintroscreen.SlideFragment
    public boolean canMoveFurther() {
        return true;
    }

    @Override // io.github.dreierf.materialintroscreen.SlideFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("Args should be provided for fragment!");
        }
        return getLayoutInflater().inflate(arguments.getInt(layoutIdKey), container, false);
    }

    /* compiled from: CustomLayoutIntroFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/tutorial/CustomLayoutIntroFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "layoutIdKey", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/tutorial/CustomLayoutIntroFragment;", CustomLayoutIntroFragment.layoutIdKey, "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CustomLayoutIntroFragment newInstance(int layoutId) {
            CustomLayoutIntroFragment customLayoutIntroFragment = new CustomLayoutIntroFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(CustomLayoutIntroFragment.layoutIdKey, layoutId);
            customLayoutIntroFragment.setArguments(bundle);
            return customLayoutIntroFragment;
        }
    }
}
