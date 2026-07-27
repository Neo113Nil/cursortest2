package sg.bigo.ads.n0;

import android.widget.CompoundButton;
import sg.bigo.ads.m0.AbstractC5348a;

/* loaded from: classes3.dex */
public final class g implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            compoundButton.setTextColor(-16736769);
        } else {
            compoundButton.setTextColor(AbstractC5348a.f13109a ? -2431246 : -14275021);
        }
    }
}
