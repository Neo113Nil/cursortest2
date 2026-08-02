package org.betup.bus;

import android.view.View;
import org.betup.ui.tour.Tour;
import org.betup.ui.tour.TourHelperPosition;
import org.betup.ui.tour.TourHelperSign;
import tourguide.tourguide.Overlay;

/* loaded from: classes2.dex */
public class TourMessage {
    private boolean clickDismiss;
    private boolean displayPointer;
    private View.OnClickListener listener;
    private TourHelperPosition position;
    private TourHelperSign sign;
    private Overlay.Style style;
    private String subtitle;
    private String title;
    private Tour type;
    private View view;

    private TourMessage(Tour type) {
        this.clickDismiss = false;
        this.displayPointer = true;
        this.type = type;
    }

    public TourHelperSign getSign() {
        return this.sign;
    }

    public TourHelperPosition getPosition() {
        return this.position;
    }

    public View getView() {
        return this.view;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public Tour getType() {
        return this.type;
    }

    public View.OnClickListener getListener() {
        return this.listener;
    }

    public Overlay.Style getStyle() {
        return this.style;
    }

    public boolean isClickDismiss() {
        return this.clickDismiss;
    }

    public boolean isDisplayPointer() {
        return this.displayPointer;
    }

    public void setDisplayPointer(boolean displayPointer) {
        this.displayPointer = displayPointer;
    }

    public static class Builder {
        private TourMessage message;

        public Builder(Tour type) {
            this.message = new TourMessage(type);
        }

        public Builder setSign(TourHelperSign sign) {
            this.message.sign = sign;
            return this;
        }

        public Builder setPosition(TourHelperPosition position) {
            this.message.position = position;
            return this;
        }

        public Builder setTitle(String title) {
            this.message.title = title;
            return this;
        }

        public Builder setSubtitle(String subtitle) {
            this.message.subtitle = subtitle;
            return this;
        }

        public Builder setView(View view) {
            this.message.view = view;
            return this;
        }

        public Builder setAutoDismiss(boolean dismiss) {
            this.message.clickDismiss = dismiss;
            return this;
        }

        public Builder setStyle(Overlay.Style style) {
            this.message.style = style;
            return this;
        }

        public Builder setDisplayPointer(boolean displayPointer) {
            this.message.displayPointer = displayPointer;
            return this;
        }

        public Builder setListener(View.OnClickListener listener) {
            this.message.listener = listener;
            return this;
        }

        public TourMessage build() {
            return this.message;
        }
    }
}
