package sg.bigo.ads.n0;

import android.widget.RadioButton;
import android.widget.RadioGroup;

/* loaded from: classes3.dex */
public final class f implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RadioGroup f13203a;
    public final /* synthetic */ h b;

    public f(h hVar, RadioGroup radioGroup) {
        this.b = hVar;
        this.f13203a = radioGroup;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f13203a.requestFocus();
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        this.b.a(2);
        if (radioButton != null) {
            radioButton.setTextColor(-16736769);
            this.b.c = radioButton.getText().toString();
            h hVar = this.b;
            e eVar = hVar.i;
            if (eVar != null) {
                eVar.a(hVar.e, hVar.c);
            }
        }
    }
}
