package com.microblink.blinkid.fragment.overlay.components.statusmsg;

/* loaded from: classes10.dex */
public interface StatusTextStyler {

    public static class Default implements com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler {
        final int getHighSpeedVideoFpsRangesFor;

        public Default(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler
        public void applyStyle(android.widget.TextView textView) {
            textView.setTextAppearance(textView.getContext(), this.getHighSpeedVideoFpsRangesFor);
        }
    }

    void applyStyle(android.widget.TextView textView);
}
