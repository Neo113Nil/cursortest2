package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.impl.w2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class g0 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f4205a;
    private w2 b;
    private List c;
    private final Set d = new HashSet();
    private TextView e;
    private ListView f;

    class a extends w2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.w2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.w2
        protected List c(int i) {
            return g0.this.c;
        }

        @Override // com.applovin.impl.w2
        protected int d(int i) {
            return g0.this.c.size();
        }

        @Override // com.applovin.impl.w2
        protected v2 e(int i) {
            return new a5("");
        }
    }

    private int b(boolean z) {
        return getColor(z ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_checkmarkColor);
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f4205a;
    }

    public void initialize(final List<f0> list, com.applovin.impl.sdk.l lVar) {
        this.f4205a = lVar;
        this.c = a(list);
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new w2.a() { // from class: com.applovin.impl.g0$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.w2.a
            public final void a(n2 n2Var, v2 v2Var) {
                g0.this.a(list, n2Var, v2Var);
            }
        });
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Axon Events");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f = listView;
        listView.setAdapter((ListAdapter) this.b);
        TextView textView = new TextView(this);
        this.e = textView;
        textView.setGravity(17);
        this.e.setTextSize(18.0f);
        this.e.setText(R.string.applovin_mediation_debugger_no_axon_events_text);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.default_margin);
        this.e.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ((FrameLayout) findViewById(android.R.id.content)).addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
        a();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.axon_events_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_clear) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f4205a.G().clearTrackedAxonEvents();
        this.c.clear();
        this.b.notifyDataSetChanged();
        a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, n2 n2Var, v2 v2Var) {
        int a2 = n2Var.a();
        if (this.d.contains(Integer.valueOf(a2))) {
            this.d.remove(Integer.valueOf(a2));
        } else {
            this.d.add(Integer.valueOf(a2));
        }
        this.c = a(list);
        this.b.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            f0 f0Var = (f0) list.get(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String a2 = f0Var.a();
            boolean isValidString = StringUtils.isValidString(a2);
            if (this.d.contains(Integer.valueOf(i))) {
                Map d = f0Var.d();
                Map c = f0Var.c();
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("PARAMETERS: ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(!d.isEmpty() ? JsonUtils.maybeConvertToIndentedString(new JSONObject(d)) : "None", ViewCompat.MEASURED_STATE_MASK));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nOPTIONS: ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c.isEmpty() ? "None" : JsonUtils.maybeConvertToIndentedString(new JSONObject(c)), ViewCompat.MEASURED_STATE_MASK));
                if (isValidString) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nERROR: ", SupportMenu.CATEGORY_MASK));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(a2, SupportMenu.CATEGORY_MASK));
                }
            }
            arrayList.add(v2.a(v2.c.DETAIL).b(StringUtils.createSpannedString(f0Var.b(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(a(isValidString)).b(b(isValidString)).a(true).a());
        }
        return arrayList;
    }

    private int a(boolean z) {
        return z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_check_mark_bordered;
    }

    private void a() {
        if (this.c.isEmpty()) {
            this.e.setVisibility(0);
            this.f.setVisibility(8);
        } else {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
        }
    }
}
