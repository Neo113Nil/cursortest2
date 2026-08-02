package org.betup.ui.tour;

import android.view.View;
import org.betup.bus.TourMessage;
import org.betup.ui.LifecycleListener;

/* loaded from: classes4.dex */
public interface TourHelper extends LifecycleListener {
    void complete();

    void displayTour(TourMessage tourMessage);

    void hideTours();

    boolean isCompleted();

    boolean isTour();

    void resetTour();

    void setCompleted(Tour type);

    void setIsTour(boolean isTour);

    void start(View view);

    boolean wasShown(Tour type);
}
