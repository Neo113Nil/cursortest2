package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.gpj;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.sf;
import com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm;
import com.bytedance.sdk.openadsdk.gbb.pcc.sf;
import com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class TTHistoryActivity extends TTBaseActivity {
    private of gbb;
    private com.bytedance.sdk.openadsdk.core.wh.oo gm;
    private com.bytedance.sdk.openadsdk.gbb.pcc.sf hc;
    private boolean jr;
    private String kj;
    private com.bytedance.sdk.openadsdk.core.wh.oo oo;
    private com.bytedance.sdk.openadsdk.gbb.pcc.sf.sf ork;
    private String qf;
    private com.bytedance.sdk.openadsdk.core.wh.gm sf;
    private FrameLayout tmg;
    private com.bytedance.sdk.openadsdk.core.wh.vj vh;
    private String vj;
    private String wh;
    private ArrayList<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> vy = new ArrayList<>();
    private final String dax = "is_new_style";
    int pcc = -1;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!jr.vj()) {
            finish();
            return;
        }
        try {
            lu.sf(this);
        } catch (Throwable unused) {
        }
        try {
            setContentView(pcc());
            Intent intent = getIntent();
            this.jr = intent.getBooleanExtra("is_new_style", false);
            this.gbb = atb.pcc().pcc(atb.pcc(intent));
            if (bundle != null) {
                try {
                    int i = bundle.getInt("meta_index", -1);
                    this.pcc = i;
                    if (i >= 0) {
                        this.gbb = atb.pcc().pcc(this.pcc);
                    }
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.openadsdk.gbb.vj.pcc(this);
            this.gm = (com.bytedance.sdk.openadsdk.core.wh.oo) this.sf.findViewById(nac.gdh);
            this.oo = (com.bytedance.sdk.openadsdk.core.wh.oo) this.sf.findViewById(520093720);
            this.ork.findViewById(nac.ei);
            this.gm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryActivity.this.pcc(view);
                }
            });
            this.oo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryActivity.this.finish();
                }
            });
            com.bytedance.sdk.openadsdk.gbb.pcc.sf sfVar = this.hc;
            if (sfVar != null) {
                sfVar.pcc(new sf.InterfaceC0186sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.3
                    @Override // com.bytedance.sdk.openadsdk.gbb.pcc.sf.InterfaceC0186sf
                    public void pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
                        if (TTHistoryActivity.this.jr) {
                            TTHistoryActivity.this.pcc(pccVar.qf(), pccVar.vj(), pccVar.sf());
                        } else {
                            TTHistoryLandingPageActivity.pcc(TTHistoryActivity.this, pccVar.qf(), pccVar.vj(), pccVar.sf());
                        }
                        TTHistoryActivity.this.finish();
                    }
                });
            }
            sf();
            gm();
        } catch (Throwable unused3) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, final String str2, final int i) {
        if (TextUtils.isEmpty(str) || i < 0) {
            finish();
        } else {
            com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(str, new gm.InterfaceC0184gm() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4
                @Override // com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.InterfaceC0184gm
                public void pcc(final String str3) {
                    rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            List<of> sf = com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.sf(str3);
                            of ofVar = (sf == null || i < 0 || i >= sf.size()) ? null : sf.get(i);
                            if (ofVar == null) {
                                TTHistoryActivity.this.finish();
                            } else {
                                IABLandingPageActivity.sf(TTHistoryActivity.this, ofVar, str2);
                            }
                        }
                    });
                }

                @Override // com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.InterfaceC0184gm
                public void sf(String str3) {
                    rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TTHistoryActivity.this.finish();
                        }
                    });
                }
            });
        }
    }

    private View pcc() {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        if (Build.VERSION.SDK_INT >= 35) {
            gmVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        this.vh = vjVar;
        vjVar.setOrientation(1);
        gmVar.addView(this.vh, new FrameLayout.LayoutParams(-1, -1));
        this.vh.setId(nac.ew);
        this.vh.setPadding(0, rj.sf(this, 12.0f), 0, 0);
        this.sf = new gpj(this);
        this.vh.addView(this.sf, new LinearLayout.LayoutParams(-1, rj.sf(this, 44.0f)));
        FrameLayout frameLayout = new FrameLayout(this);
        this.tmg = frameLayout;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setId(nac.tmh);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        com.bytedance.sdk.openadsdk.gbb.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.gbb.pcc.sf(this);
        this.hc = sfVar;
        recyclerView.setAdapter(sfVar);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
        this.tmg.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.gbb.pcc.sf.sf sfVar2 = new com.bytedance.sdk.openadsdk.gbb.pcc.sf.sf(this);
        this.ork = sfVar2;
        sfVar2.setId(nac.ei);
        this.tmg.addView(this.ork, new FrameLayout.LayoutParams(-1, -1));
        this.vh.addView(this.tmg);
        return gmVar;
    }

    private void sf() {
        com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(new gm.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.5
            @Override // com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.sf
            public void pcc(List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> list) {
                if (list != null) {
                    TTHistoryActivity.this.vy.addAll(list);
                    TTHistoryActivity.this.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TTHistoryActivity.this.gm();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        if (!this.vy.isEmpty()) {
            this.gm.setVisibility(0);
            this.tmg.setVisibility(0);
            com.bytedance.sdk.openadsdk.gbb.pcc.sf.sf sfVar = this.ork;
            if (sfVar != null) {
                sfVar.setVisibility(8);
            }
        } else {
            com.bytedance.sdk.openadsdk.gbb.pcc.sf.sf sfVar2 = this.ork;
            if (sfVar2 != null) {
                sfVar2.pcc();
                this.ork.setVisibility(0);
            }
            this.gm.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.gbb.pcc.sf sfVar3 = this.hc;
        if (sfVar3 != null) {
            sfVar3.pcc(this.vy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(View view) {
        final com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc(this);
        pccVar.setOnMenuItemClickListener(new pcc.InterfaceC0185pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.6
            @Override // com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc.InterfaceC0185pcc
            public void pcc() {
                TTHistoryActivity.this.vj();
                pccVar.pcc();
            }

            @Override // com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc.InterfaceC0185pcc
            public void sf() {
                pccVar.pcc();
            }
        });
        pccVar.pcc(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vj() {
        com.bytedance.sdk.openadsdk.core.widget.sf sfVar = new com.bytedance.sdk.openadsdk.core.widget.sf(this);
        try {
            this.vj = getString(tz.sf(this, "tt_history_confirm_maintitle"));
            this.wh = getString(tz.sf(this, "tt_history_confirm_subtitle"));
            this.qf = getString(tz.sf(this, "tt_history_cancel"));
            this.kj = getString(tz.sf(this, "tt_history_delete"));
            sfVar.sf(this.vj).pcc(this.wh).gm(this.kj).oo(this.qf);
            sfVar.pcc(new AnonymousClass7(sfVar)).show();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity$7, reason: invalid class name */
    class AnonymousClass7 implements sf.InterfaceC0181sf {
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.widget.sf pcc;

        AnonymousClass7(com.bytedance.sdk.openadsdk.core.widget.sf sfVar) {
            this.pcc = sfVar;
        }

        @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
        public void pcc() {
            try {
                com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(new gm.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.7.1
                    @Override // com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc
                    public void pcc() {
                        TTHistoryActivity.this.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.7.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TTHistoryActivity.this.vy.clear();
                                if (!com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_iab_cookie", true)) {
                                    Toast.makeText(TTHistoryActivity.this, TTHistoryActivity.this.getString(tz.sf(TTHistoryActivity.this, "tt_history_delete_successful")), 0).show();
                                } else {
                                    TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(TTHistoryActivity.this);
                                    ((FrameLayout) TTHistoryActivity.this.findViewById(R.id.content)).addView(tTAdDislikeToast);
                                    tTAdDislikeToast.show(TTHistoryActivity.this.getString(tz.sf(TTHistoryActivity.this, "tt_history_delete_successful")));
                                }
                                TTHistoryActivity.this.gm();
                            }
                        });
                        TTHistoryActivity.this.gbb = com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().gm();
                        if (TTHistoryActivity.this.gbb != null) {
                            com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), TTHistoryActivity.this.gbb, "landingpage", "iab_clear_history_all");
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc
                    public void pcc(Exception exc) {
                        exc.getMessage();
                    }
                });
            } catch (Exception e) {
                e.getMessage();
            }
            this.pcc.dismiss();
        }

        @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
        public void sf() {
            this.pcc.dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int pcc = this.gbb != null ? atb.pcc().pcc(this.gbb) : -1;
            this.pcc = pcc;
            bundle.putInt("meta_index", pcc);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.pcc >= 0) {
            atb.pcc().gm(this.pcc);
            this.pcc = -1;
        }
    }
}
