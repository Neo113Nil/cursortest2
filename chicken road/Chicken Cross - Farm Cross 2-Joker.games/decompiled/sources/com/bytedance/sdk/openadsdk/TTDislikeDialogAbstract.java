package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.gm.ork;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements ork.sf {
    protected final ork gm;
    private View oo;
    protected String pcc;
    protected List<FilterWord> sf;

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public TTDislikeDialogAbstract(Context context) {
        super(context);
        ork orkVar = new ork();
        this.gm = orkVar;
        orkVar.pcc(this);
    }

    public TTDislikeDialogAbstract(Context context, int i) {
        super(context, i);
        ork orkVar = new ork();
        this.gm = orkVar;
        orkVar.pcc(this);
    }

    public ork getDislikeManager() {
        return this.gm;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.oo = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.oo;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.pcc = str;
        this.sf = list;
        this.gm.pcc(str);
        this.gm.pcc(this.sf);
    }

    public void onSuggestionSubmit(String str) {
        ork orkVar = this.gm;
        if (orkVar != null) {
            orkVar.gm(str);
        }
    }

    public void destroy() {
        ork orkVar = this.gm;
        if (orkVar != null) {
            orkVar.pcc();
        }
    }
}
