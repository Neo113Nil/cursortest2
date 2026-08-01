package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.d;
import com.applovin.impl.i3;
import com.applovin.impl.k3;
import com.applovin.impl.w2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* loaded from: classes5.dex */
public abstract class j3 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private k3 f4257a;
    private ListView b;

    class a implements w2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i3 f4258a;

        /* renamed from: com.applovin.impl.j3$a$a, reason: collision with other inner class name */
        class C0074a implements d.b {
            C0074a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f4258a);
            }
        }

        a(i3 i3Var) {
            this.f4258a = i3Var;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            if (n2Var.b() != k3.a.TEST_ADS.ordinal()) {
                t7.a(v2Var.c(), v2Var.b(), j3.this);
                return;
            }
            com.applovin.impl.sdk.l o = this.f4258a.o();
            i3.b y = this.f4258a.y();
            if (!j3.this.f4257a.a(n2Var)) {
                t7.a(v2Var.c(), v2Var.b(), j3.this);
                return;
            }
            if (i3.b.READY == y) {
                d.a(j3.this, MaxDebuggerMultiAdActivity.class, o.e(), new C0074a());
            } else if (i3.b.DISABLED != y) {
                t7.a(v2Var.c(), v2Var.b(), j3.this);
            } else {
                o.u0().a();
                t7.a(v2Var.c(), v2Var.b(), j3.this);
            }
        }
    }

    public j3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        k3 k3Var = this.f4257a;
        if (k3Var != null) {
            return k3Var.h().o();
        }
        return null;
    }

    public void initialize(i3 i3Var) {
        setTitle(i3Var.g());
        k3 k3Var = new k3(i3Var, this);
        this.f4257a = k3Var;
        k3Var.a(new a(i3Var));
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.b = listView;
        listView.setAdapter((ListAdapter) this.f4257a);
    }

    @Override // com.applovin.impl.r3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f4257a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f4257a.k();
            this.f4257a.c();
        }
    }
}
