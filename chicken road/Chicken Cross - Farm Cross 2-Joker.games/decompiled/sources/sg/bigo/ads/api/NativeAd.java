package sg.bigo.ads.api;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* loaded from: classes3.dex */
public interface NativeAd extends Ad {

    public enum CreativeType {
        IMAGE,
        VIDEO,
        UNKNOWN
    }

    String getAdvertiser();

    String getCallToAction();

    CreativeType getCreativeType();

    String getDescription();

    float getMediaContentAspectRatio();

    sg.bigo.ads.P.b getPopPage();

    String getSponsored();

    String getTitle();

    VideoController getVideoController();

    String getWarning();

    boolean hasIcon();

    void registerViewForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, AdOptionsView adOptionsView, List<View> list);

    void registerViewForInteraction(NativeAdView nativeAdView, MediaView mediaView, AdIconView adIconView, AdOptionsView adOptionsView, List<View> list);
}
