package com.door.brass.knob;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import dagger.hilt.android.AndroidEntryPoint;
import defpackage.j7;
import kotlin.Metadata;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/door/brass/knob/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class MainActivity extends Hilt_MainActivity {
    @Override // com.door.brass.knob.Hilt_MainActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        EdgeToEdge.yzPsTade5rL7D3(this, new SystemBarStyle(new j7(i)), new SystemBarStyle(new j7(i)));
        ViewGroup.LayoutParams layoutParams = ComponentActivityKt.yzPsTade5rL7D3;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$MainActivityKt.ra306ClFT3HT;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(composableLambdaImpl);
            return;
        }
        ComposeView composeView2 = new ComposeView(this);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(composableLambdaImpl);
        View decorView = getWindow().getDecorView();
        if (ViewTreeLifecycleOwner.yzPsTade5rL7D3(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (ViewTreeViewModelStoreOwner.yzPsTade5rL7D3(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (ViewTreeSavedStateRegistryOwner.yzPsTade5rL7D3(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(composeView2, ComponentActivityKt.yzPsTade5rL7D3);
    }
}
