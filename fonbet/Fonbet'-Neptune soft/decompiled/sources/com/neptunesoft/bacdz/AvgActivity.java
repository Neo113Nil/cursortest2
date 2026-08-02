package com.neptunesoft.bacdz;

import android.content.Context;
import android.content.Intent;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.bacdz.adapter.AdapterAvg;
import com.neptunesoft.bacdz.classobjects.Avg;
import com.neptunesoft.bacdz.database.DataBaseMarks;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AvgActivity extends AppCompatActivity {
    static AdapterAvg adapterAvg;
    static List<Object> list = new ArrayList();
    static RecyclerView recyclerViewAvg;
    Button addTriple;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.AvgActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AvgActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        recyclerViewAvg = (RecyclerView) findViewById(R.id.avgRecyclerView);
        this.addTriple = (Button) findViewById(R.id.addTriple);
        recyclerViewAvg.setHasFixedSize(false);
        recyclerViewAvg.setLayoutManager(new LinearLayoutManager(this));
        this.addTriple.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.AvgActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvgActivity.this.m541lambda$onCreate$1$comneptunesoftbacdzAvgActivity(view);
            }
        });
        refreshRecycleView(this);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets platformInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            i = platformInsets.left;
            i2 = platformInsets.top;
            i3 = platformInsets.right;
            i4 = platformInsets.bottom;
            view.setPadding(i, i2, i3, i4);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-AvgActivity, reason: not valid java name */
    /* synthetic */ void m541lambda$onCreate$1$comneptunesoftbacdzAvgActivity(View view) {
        startActivity(new Intent(this, (Class<?>) AddTripleActivity.class));
    }

    static void refreshRecycleView(final Context context) {
        DataBaseMarks dataBaseMarks = new DataBaseMarks(context, SplashScreen.darkmode);
        list.clear();
        list = dataBaseMarks.getAllAvg();
        AdapterAvg adapterAvg2 = new AdapterAvg(list);
        adapterAvg = adapterAvg2;
        recyclerViewAvg.setAdapter(adapterAvg2);
        adapterAvg.setClickListener(new AdapterAvg.ItemClickListener() { // from class: com.neptunesoft.bacdz.AvgActivity$$ExternalSyntheticLambda2
            @Override // com.neptunesoft.bacdz.adapter.AdapterAvg.ItemClickListener
            public final void onItemClick(View view, int i) {
                AvgActivity.lambda$refreshRecycleView$2(context, view, i);
            }
        });
    }

    static /* synthetic */ void lambda$refreshRecycleView$2(Context context, View view, int i) {
        ListMarksActivity.avg = (Avg) list.get(i);
        context.startActivity(new Intent(context, (Class<?>) ListMarksActivity.class));
    }
}
