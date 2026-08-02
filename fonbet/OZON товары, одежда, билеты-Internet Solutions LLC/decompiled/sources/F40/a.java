package F40;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import t40.EnumC9751a;
import t40.EnumC9752b;

/* loaded from: classes3.dex */
public interface a extends Parcelable {
    Float getAlpha();

    String getBackgroundColor();

    List<String> getBackgroundGradient();

    EnumC9751a getBackgroundGradientOrientation();

    List<Integer> getBackgroundRadius();

    Boolean getClickable();

    String getComposerActionBehavior();

    String getComposerActionId();

    String getComposerActionLink();

    Map<String, String> getComposerActionParams();

    Map<String, ComposerTrackingInfo> getComposerTrackingInfo();

    Integer getDashGap();

    Integer getDashWidth();

    Boolean getDisableHighlightAnimation();

    Integer getElevation();

    Integer getHeight();

    @NotNull
    String getId();

    List<EnumC9752b> getLayoutGravity();

    Float getLayoutWeight();

    List<Integer> getMargins();

    List<Integer> getPaddings();

    Float getPercentW();

    Integer getRatioH();

    Integer getRatioW();

    Boolean getSkeletonable();

    String getStrokeColor();

    Integer getStrokeWidth();

    Boolean getTouchDown();

    @NotNull
    CbottomElement2 getType();

    Integer getVersion();

    Integer getWidth();

    Boolean isHidden();
}
