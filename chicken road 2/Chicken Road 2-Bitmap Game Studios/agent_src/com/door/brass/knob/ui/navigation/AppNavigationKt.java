package com.door.brass.knob.ui.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.BundleCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavControllerImpl;
import androidx.os.SavedStateReaderKt;
import defpackage.WX2SCXtutbTy;
import defpackage.f1;
import defpackage.n2IngT64plxYCgL;
import defpackage.riuNqmSPy3ecRm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "navBackStackEntry", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppNavigationKt {
    public static final void yzPsTade5rL7D3(int i, Composer composer) {
        NavDestination navDestination;
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(1771191558);
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i & 1, i != 0)) {
            final Context context = (Context) BD2CRjLJ8EtOqGQ.Uo5pffGf8LUU(AndroidCompositionLocals_androidKt.hRNgd2zGCE5kj);
            Object[] copyOf = Arrays.copyOf(new Navigator[0], 0);
            SaverKt$Saver$1 saverKt$Saver$1 = new SaverKt$Saver$1(new f1(8), new Function1() { // from class: androidx.navigation.compose.hRNgd2zGCE5kj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object uypNJrpDByoB(Object obj) {
                    Bundle bundle;
                    Bundle[] bundleArr;
                    Throwable th;
                    Bundle bundle2 = (Bundle) obj;
                    NavHostController yzPsTade5rL7D3 = NavHostControllerKt__NavHostController_androidKt.yzPsTade5rL7D3(context);
                    if (bundle2 != null) {
                        bundle2.setClassLoader(yzPsTade5rL7D3.yzPsTade5rL7D3.getClassLoader());
                    }
                    NavControllerImpl navControllerImpl = yzPsTade5rL7D3.hRNgd2zGCE5kj;
                    LinkedHashMap linkedHashMap = navControllerImpl.yRx9jbDCTnXb3;
                    Throwable th2 = null;
                    if (bundle2 == null) {
                        th = null;
                    } else {
                        if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                            bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                            if (bundle == null) {
                                SavedStateReaderKt.yzPsTade5rL7D3("android-support-nav:controller:navigatorState");
                                throw null;
                            }
                        } else {
                            bundle = null;
                        }
                        navControllerImpl.oyjLVtGms9eZwJ0 = bundle;
                        if (bundle2.containsKey("android-support-nav:controller:backStack")) {
                            ArrayList yzPsTade5rL7D32 = BundleCompat.yzPsTade5rL7D3(bundle2, "android-support-nav:controller:backStack", JvmClassMappingKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(Bundle.class)));
                            if (yzPsTade5rL7D32 == null) {
                                SavedStateReaderKt.yzPsTade5rL7D3("android-support-nav:controller:backStack");
                                throw null;
                            }
                            bundleArr = (Bundle[]) yzPsTade5rL7D32.toArray(new Bundle[0]);
                        } else {
                            bundleArr = null;
                        }
                        navControllerImpl.b41X89IqSbKt = bundleArr;
                        linkedHashMap.clear();
                        if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                            if (intArray == null) {
                                SavedStateReaderKt.yzPsTade5rL7D3("android-support-nav:controller:backStackDestIds");
                                throw null;
                            }
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList == null) {
                                SavedStateReaderKt.yzPsTade5rL7D3("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                            int length = intArray.length;
                            int i2 = 0;
                            int i3 = 0;
                            while (i2 < length) {
                                int i4 = i3 + 1;
                                Throwable th3 = th2;
                                navControllerImpl.uypNJrpDByoB.put(Integer.valueOf(intArray[i2]), !Intrinsics.yzPsTade5rL7D3(stringArrayList.get(i3), "") ? (String) stringArrayList.get(i3) : th3);
                                i2++;
                                th2 = th3;
                                i3 = i4;
                            }
                        }
                        th = th2;
                        if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                            if (stringArrayList2 == null) {
                                SavedStateReaderKt.yzPsTade5rL7D3("android-support-nav:controller:backStackStates");
                                throw th;
                            }
                            int size = stringArrayList2.size();
                            int i5 = 0;
                            while (i5 < size) {
                                String str = stringArrayList2.get(i5);
                                i5++;
                                String str2 = str;
                                if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                    String str3 = "android-support-nav:controller:backStackStates:" + str2;
                                    ArrayList yzPsTade5rL7D33 = BundleCompat.yzPsTade5rL7D3(bundle2, str3, JvmClassMappingKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(Bundle.class)));
                                    if (yzPsTade5rL7D33 == null) {
                                        SavedStateReaderKt.yzPsTade5rL7D3(str3);
                                        throw th;
                                    }
                                    ArrayDeque arrayDeque = new ArrayDeque(yzPsTade5rL7D33.size());
                                    int size2 = yzPsTade5rL7D33.size();
                                    int i6 = 0;
                                    while (i6 < size2) {
                                        Object obj2 = yzPsTade5rL7D33.get(i6);
                                        i6++;
                                        arrayDeque.addLast(new NavBackStackEntryState((Bundle) obj2));
                                    }
                                    linkedHashMap.put(str2, arrayDeque);
                                }
                            }
                        }
                    }
                    if (bundle2 != null) {
                        boolean z = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                        Boolean valueOf = (z || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : th;
                        yzPsTade5rL7D3.b41X89IqSbKt = valueOf != 0 ? valueOf.booleanValue() : false;
                    }
                    return yzPsTade5rL7D3;
                }
            });
            boolean NIabVTHf6LMJyXq = BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(context);
            Object UEutaskTsxaI = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
            if (NIabVTHf6LMJyXq || UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                UEutaskTsxaI = new Function0() { // from class: androidx.navigation.compose.yzPsTade5rL7D3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object hRNgd2zGCE5kj() {
                        return NavHostControllerKt__NavHostController_androidKt.yzPsTade5rL7D3(context);
                    }
                };
                BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI);
            }
            NavHostController navHostController = (NavHostController) RememberSaveableKt.ra306ClFT3HT(copyOf, saverKt$Saver$1, (Function0) UEutaskTsxaI, BD2CRjLJ8EtOqGQ, 0, 4);
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) SnapshotStateKt.yzPsTade5rL7D3(FlowKt.hRNgd2zGCE5kj(navHostController.hRNgd2zGCE5kj.BD2CRjLJ8EtOqGQ), null, null, BD2CRjLJ8EtOqGQ, 48, 2).getOyjLVtGms9eZwJ0();
            String str = (navBackStackEntry == null || (navDestination = navBackStackEntry.b41X89IqSbKt) == null) ? null : navDestination.b41X89IqSbKt.b41X89IqSbKt;
            List Yey4RyhSyBRHub = CollectionsKt.Yey4RyhSyBRHub(BottomNavItem.i7xAcZoXXiIt, BottomNavItem.Uo5pffGf8LUU, BottomNavItem.FsuUJlzzWhYnMlD);
            ArrayList arrayList = new ArrayList(CollectionsKt.NIabVTHf6LMJyXq(Yey4RyhSyBRHub, 10));
            Iterator it = Yey4RyhSyBRHub.iterator();
            while (it.hasNext()) {
                arrayList.add(((BottomNavItem) it.next()).oyjLVtGms9eZwJ0);
            }
            ScaffoldKt.yzPsTade5rL7D3(null, null, ComposableLambdaKt.hRNgd2zGCE5kj(280805515, new riuNqmSPy3ecRm(CollectionsKt.GiTAvmtrM6Bh8SJ(arrayList, str), Yey4RyhSyBRHub, str, navHostController), BD2CRjLJ8EtOqGQ), null, null, 0, Color.gmXBnHsR2YSm, MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).o2t7oodqU1bUMaS, null, ComposableLambdaKt.hRNgd2zGCE5kj(176374485, new WX2SCXtutbTy(0, navHostController), BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, 806879616, 315);
            BD2CRjLJ8EtOqGQ = BD2CRjLJ8EtOqGQ;
        } else {
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
        }
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new n2IngT64plxYCgL(i, 2));
        }
    }
}
