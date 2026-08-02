package androidx.glance.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.DpSize;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.GlanceId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.C1062g;
import kotlinx.coroutines.flow.InterfaceC1060e;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 =2\u00020\u0001:\u0003<=>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u0010H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0017J/\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b\"\b\b\u0000\u0010#*\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H#0&H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0011\u0010)\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001b\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0081@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0012JM\u0010.\u001a\u00020/\"\b\b\u0000\u0010#*\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u0002H#0&2\n\b\u0002\u00102\u001a\u0004\u0018\u00010$2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u00104\u001a\u0004\u0018\u000105H\u0086@ø\u0001\u0000¢\u0006\u0002\u00106J7\u00107\u001a\u00020\u0010\"\b\b\u0000\u00108*\u000200\"\b\b\u0001\u00109*\u00020$2\u0006\u00101\u001a\u0002H82\u0006\u0010%\u001a\u0002H9H\u0080@ø\u0001\u0000¢\u0006\u0004\b:\u0010;R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "kotlin.jvm.PlatformType", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getDataStore", "()Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/Lazy;", "cleanReceivers", "", "cleanReceivers$glance_appwidget_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createState", "Landroidx/glance/appwidget/GlanceAppWidgetManager$State;", "prefs", "getAppWidgetId", "", "glanceId", "Landroidx/glance/GlanceId;", "getAppWidgetSizes", "", "Landroidx/compose/ui/unit/DpSize;", "(Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGlanceIdBy", "configurationIntent", "Landroid/content/Intent;", "appWidgetId", "getGlanceIds", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/glance/appwidget/GlanceAppWidget;", "provider", "Ljava/lang/Class;", "(Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrCreateDataStore", "getState", "listKnownReceivers", "", "", "listKnownReceivers$glance_appwidget_release", "requestPinGlanceAppWidget", "", "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "receiver", "preview", "previewState", "successCallback", "Landroid/app/PendingIntent;", "(Ljava/lang/Class;Landroidx/glance/appwidget/GlanceAppWidget;Ljava/lang/Object;Landroid/app/PendingIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateReceiver", "R", "P", "updateReceiver$glance_appwidget_release", "(Landroidx/glance/appwidget/GlanceAppWidgetReceiver;Landroidx/glance/appwidget/GlanceAppWidget;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AppWidgetManagerApi26Impl", "Companion", "State", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlanceAppWidgetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceAppWidgetManager.kt\nandroidx/glance/appwidget/GlanceAppWidgetManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,272:1\n1#2:273\n1#2:284\n1603#3,9:274\n1855#3:283\n1856#3:285\n1612#3:286\n1360#3:287\n1446#3,2:288\n1448#3,3:294\n223#3,2:297\n766#3:299\n857#3,2:300\n1549#3:302\n1620#3,3:303\n11365#4:290\n11700#4,3:291\n*S KotlinDebug\n*F\n+ 1 GlanceAppWidgetManager.kt\nandroidx/glance/appwidget/GlanceAppWidgetManager\n*L\n87#1:284\n87#1:274,9\n87#1:283\n87#1:285\n87#1:286\n105#1:287\n105#1:288,2\n105#1:294,3\n199#1:297,2\n226#1:299\n226#1:300,2\n227#1:302\n227#1:303,3\n106#1:290\n106#1:291,3\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetManager {
    private static DataStore<Preferences> dataStoreSingleton;
    private final AppWidgetManager appWidgetManager;
    private final Context context;

    /* renamed from: dataStore$delegate, reason: from kotlin metadata */
    private final Lazy dataStore = LazyKt.lazy(new Function0<DataStore<Preferences>>() { // from class: androidx.glance.appwidget.GlanceAppWidgetManager$dataStore$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DataStore<Preferences> invoke() {
            DataStore<Preferences> orCreateDataStore;
            orCreateDataStore = GlanceAppWidgetManager.this.getOrCreateDataStore();
            return orCreateDataStore;
        }
    });
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ReadOnlyProperty<Context, DataStore<Preferences>> appManagerDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("GlanceAppWidgetManager", null, null, null, 14, null);
    private static final Preferences.Key<Set<String>> providersKey = PreferencesKeys.stringSetKey("list::Providers");

    @RequiresApi(26)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J,\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager$AppWidgetManagerApi26Impl;", "", "()V", "isRequestPinAppWidgetSupported", "", "manager", "Landroid/appwidget/AppWidgetManager;", "requestPinAppWidget", "target", "Landroid/content/ComponentName;", "extras", "Landroid/os/Bundle;", "successCallback", "Landroid/app/PendingIntent;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppWidgetManagerApi26Impl {
        public static final AppWidgetManagerApi26Impl INSTANCE = new AppWidgetManagerApi26Impl();

        private AppWidgetManagerApi26Impl() {
        }

        @DoNotInline
        public final boolean isRequestPinAppWidgetSupported(AppWidgetManager manager) {
            return manager.isRequestPinAppWidgetSupported();
        }

        @DoNotInline
        public final boolean requestPinAppWidget(AppWidgetManager manager, ComponentName target, Bundle extras, PendingIntent successCallback) {
            return manager.requestPinAppWidget(target, extras, successCallback);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager$Companion;", "", "()V", "dataStoreSingleton", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "providersKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "", "appManagerDataStore", "Landroid/content/Context;", "getAppManagerDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "appManagerDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "providerKey", "provider", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(Companion.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore<Preferences> getAppManagerDataStore(Context context) {
            return (DataStore) GlanceAppWidgetManager.appManagerDataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Preferences.Key<String> providerKey(String provider) {
            return PreferencesKeys.stringKey("provider:" + provider);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006B7\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003¢\u0006\u0002\u0010\tJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager$State;", "", "receiverToProviderName", "", "Landroid/content/ComponentName;", "", "(Ljava/util/Map;)V", "providerNameToReceivers", "", "(Ljava/util/Map;Ljava/util/Map;)V", "getProviderNameToReceivers", "()Ljava/util/Map;", "getReceiverToProviderName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class State {
        private final Map<String, List<ComponentName>> providerNameToReceivers;
        private final Map<ComponentName, String> receiverToProviderName;

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, Map map, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                map = state.receiverToProviderName;
            }
            if ((i & 2) != 0) {
                map2 = state.providerNameToReceivers;
            }
            return state.copy(map, map2);
        }

        public final Map<ComponentName, String> component1() {
            return this.receiverToProviderName;
        }

        public final Map<String, List<ComponentName>> component2() {
            return this.providerNameToReceivers;
        }

        public final State copy(Map<ComponentName, String> receiverToProviderName, Map<String, ? extends List<ComponentName>> providerNameToReceivers) {
            return new State(receiverToProviderName, providerNameToReceivers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.receiverToProviderName, state.receiverToProviderName) && Intrinsics.areEqual(this.providerNameToReceivers, state.providerNameToReceivers);
        }

        public final Map<String, List<ComponentName>> getProviderNameToReceivers() {
            return this.providerNameToReceivers;
        }

        public final Map<ComponentName, String> getReceiverToProviderName() {
            return this.receiverToProviderName;
        }

        public int hashCode() {
            return this.providerNameToReceivers.hashCode() + (this.receiverToProviderName.hashCode() * 31);
        }

        public String toString() {
            return "State(receiverToProviderName=" + this.receiverToProviderName + ", providerNameToReceivers=" + this.providerNameToReceivers + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(Map<ComponentName, String> map, Map<String, ? extends List<ComponentName>> map2) {
            this.receiverToProviderName = map;
            this.providerNameToReceivers = map2;
        }

        public /* synthetic */ State(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? MapsKt.emptyMap() : map2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public State(Map<ComponentName, String> map) {
            this(map, r0);
            Map reverseMapping;
            reverseMapping = GlanceAppWidgetManagerKt.reverseMapping(map);
        }
    }

    public GlanceAppWidgetManager(Context context) {
        this.context = context;
        this.appWidgetManager = AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final State createState(Preferences prefs) {
        String packageName = this.context.getPackageName();
        Set<String> set = (Set) prefs.get(providersKey);
        Map map = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (set == null) {
            return new State(map, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            ComponentName componentName = new ComponentName(packageName, str);
            String str2 = (String) prefs.get(Companion.providerKey(str));
            Pair pair = str2 == null ? null : TuplesKt.to(componentName, str2);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new State(MapsKt.toMap(arrayList));
    }

    private final DataStore<Preferences> getDataStore() {
        return (DataStore) this.dataStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataStore<Preferences> getOrCreateDataStore() {
        DataStore<Preferences> dataStore;
        Companion companion = Companion;
        synchronized (companion) {
            dataStore = dataStoreSingleton;
            if (dataStore == null) {
                dataStore = companion.getAppManagerDataStore(this.context);
                dataStoreSingleton = dataStore;
            }
        }
        return dataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getState(Continuation<? super State> continuation) {
        GlanceAppWidgetManager$getState$1 glanceAppWidgetManager$getState$1;
        int i;
        GlanceAppWidgetManager glanceAppWidgetManager;
        State createState;
        if (continuation instanceof GlanceAppWidgetManager$getState$1) {
            glanceAppWidgetManager$getState$1 = (GlanceAppWidgetManager$getState$1) continuation;
            int i2 = glanceAppWidgetManager$getState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetManager$getState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = glanceAppWidgetManager$getState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = glanceAppWidgetManager$getState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC1060e<Preferences> data = getDataStore().getData();
                    glanceAppWidgetManager$getState$1.L$0 = this;
                    glanceAppWidgetManager$getState$1.label = 1;
                    obj = C1062g.g(data, glanceAppWidgetManager$getState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    glanceAppWidgetManager = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    glanceAppWidgetManager = (GlanceAppWidgetManager) glanceAppWidgetManager$getState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Preferences preferences = (Preferences) obj;
                return (preferences != null || (createState = glanceAppWidgetManager.createState(preferences)) == null) ? new State(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : createState;
            }
        }
        glanceAppWidgetManager$getState$1 = new GlanceAppWidgetManager$getState$1(this, continuation);
        Object obj2 = glanceAppWidgetManager$getState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceAppWidgetManager$getState$1.label;
        if (i != 0) {
        }
        Preferences preferences2 = (Preferences) obj2;
        if (preferences2 != null) {
        }
    }

    public static /* synthetic */ Object requestPinGlanceAppWidget$default(GlanceAppWidgetManager glanceAppWidgetManager, Class cls, GlanceAppWidget glanceAppWidget, Object obj, PendingIntent pendingIntent, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            glanceAppWidget = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            pendingIntent = null;
        }
        return glanceAppWidgetManager.requestPinGlanceAppWidget(cls, glanceAppWidget, obj, pendingIntent, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object cleanReceivers$glance_appwidget_release(Continuation<? super Unit> continuation) {
        int collectionSizeOrDefault;
        String packageName = this.context.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.appWidgetManager.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (Intrinsics.areEqual(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        Object updateData = getDataStore().updateData(new GlanceAppWidgetManager$cleanReceivers$2(CollectionsKt.toSet(arrayList2), null), continuation);
        return updateData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateData : Unit.INSTANCE;
    }

    public final int getAppWidgetId(GlanceId glanceId) {
        if (glanceId instanceof AppWidgetId) {
            return ((AppWidgetId) glanceId).getAppWidgetId();
        }
        throw new IllegalArgumentException("This method only accepts App Widget Glance Id");
    }

    public final Object getAppWidgetSizes(GlanceId glanceId, Continuation<? super List<DpSize>> continuation) {
        if (glanceId instanceof AppWidgetId) {
            return AppWidgetUtilsKt.extractAllSizes(this.appWidgetManager.getAppWidgetOptions(((AppWidgetId) glanceId).getAppWidgetId()), new Function0<DpSize>() { // from class: androidx.glance.appwidget.GlanceAppWidgetManager$getAppWidgetSizes$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ DpSize invoke() {
                    return DpSize.m1107boximpl(m1307invokeMYxV2XQ());
                }

                /* renamed from: invoke-MYxV2XQ, reason: not valid java name */
                public final long m1307invokeMYxV2XQ() {
                    return DpSize.INSTANCE.m1129getZeroMYxV2XQ();
                }
            });
        }
        throw new IllegalArgumentException("This method only accepts App Widget Glance Id");
    }

    public final GlanceId getGlanceIdBy(int appWidgetId) {
        if (this.appWidgetManager.getAppWidgetInfo(appWidgetId) != null) {
            return new AppWidgetId(appWidgetId);
        }
        throw new IllegalArgumentException("Invalid AppWidget ID.");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends GlanceAppWidget> Object getGlanceIds(Class<T> cls, Continuation<? super List<? extends GlanceId>> continuation) {
        GlanceAppWidgetManager$getGlanceIds$1 glanceAppWidgetManager$getGlanceIds$1;
        int i;
        GlanceAppWidgetManager glanceAppWidgetManager;
        String canonicalName;
        if (continuation instanceof GlanceAppWidgetManager$getGlanceIds$1) {
            glanceAppWidgetManager$getGlanceIds$1 = (GlanceAppWidgetManager$getGlanceIds$1) continuation;
            int i2 = glanceAppWidgetManager$getGlanceIds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetManager$getGlanceIds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = glanceAppWidgetManager$getGlanceIds$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = glanceAppWidgetManager$getGlanceIds$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    glanceAppWidgetManager$getGlanceIds$1.L$0 = this;
                    glanceAppWidgetManager$getGlanceIds$1.L$1 = cls;
                    glanceAppWidgetManager$getGlanceIds$1.label = 1;
                    obj = getState(glanceAppWidgetManager$getGlanceIds$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    glanceAppWidgetManager = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cls = (Class) glanceAppWidgetManager$getGlanceIds$1.L$1;
                    glanceAppWidgetManager = (GlanceAppWidgetManager) glanceAppWidgetManager$getGlanceIds$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                State state = (State) obj;
                canonicalName = cls.getCanonicalName();
                if (canonicalName != null) {
                    throw new IllegalArgumentException("no canonical provider name");
                }
                List<ComponentName> list = state.getProviderNameToReceivers().get(canonicalName);
                if (list == null) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int[] appWidgetIds = glanceAppWidgetManager.appWidgetManager.getAppWidgetIds((ComponentName) it.next());
                    ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
                    for (int i3 : appWidgetIds) {
                        arrayList2.add(new AppWidgetId(i3));
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
                }
                return arrayList;
            }
        }
        glanceAppWidgetManager$getGlanceIds$1 = new GlanceAppWidgetManager$getGlanceIds$1(this, continuation);
        Object obj2 = glanceAppWidgetManager$getGlanceIds$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceAppWidgetManager$getGlanceIds$1.label;
        if (i != 0) {
        }
        State state2 = (State) obj2;
        canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object listKnownReceivers$glance_appwidget_release(Continuation<? super Collection<String>> continuation) {
        GlanceAppWidgetManager$listKnownReceivers$1 glanceAppWidgetManager$listKnownReceivers$1;
        int i;
        Preferences preferences;
        if (continuation instanceof GlanceAppWidgetManager$listKnownReceivers$1) {
            glanceAppWidgetManager$listKnownReceivers$1 = (GlanceAppWidgetManager$listKnownReceivers$1) continuation;
            int i2 = glanceAppWidgetManager$listKnownReceivers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetManager$listKnownReceivers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = glanceAppWidgetManager$listKnownReceivers$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = glanceAppWidgetManager$listKnownReceivers$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC1060e<Preferences> data = getDataStore().getData();
                    glanceAppWidgetManager$listKnownReceivers$1.label = 1;
                    obj = C1062g.g(data, glanceAppWidgetManager$listKnownReceivers$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                preferences = (Preferences) obj;
                if (preferences == null) {
                    return (Set) preferences.get(providersKey);
                }
                return null;
            }
        }
        glanceAppWidgetManager$listKnownReceivers$1 = new GlanceAppWidgetManager$listKnownReceivers$1(this, continuation);
        Object obj2 = glanceAppWidgetManager$listKnownReceivers$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceAppWidgetManager$listKnownReceivers$1.label;
        if (i != 0) {
        }
        preferences = (Preferences) obj2;
        if (preferences == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends GlanceAppWidgetReceiver> Object requestPinGlanceAppWidget(Class<T> cls, GlanceAppWidget glanceAppWidget, Object obj, PendingIntent pendingIntent, Continuation<? super Boolean> continuation) {
        GlanceAppWidgetManager$requestPinGlanceAppWidget$1 glanceAppWidgetManager$requestPinGlanceAppWidget$1;
        int i;
        ComponentName componentName;
        Bundle bundle;
        GlanceAppWidgetManager glanceAppWidgetManager;
        ComponentName componentName2;
        Bundle bundle2;
        if (continuation instanceof GlanceAppWidgetManager$requestPinGlanceAppWidget$1) {
            glanceAppWidgetManager$requestPinGlanceAppWidget$1 = (GlanceAppWidgetManager$requestPinGlanceAppWidget$1) continuation;
            int i2 = glanceAppWidgetManager$requestPinGlanceAppWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetManager$requestPinGlanceAppWidget$1.label = i2 - Integer.MIN_VALUE;
                GlanceAppWidgetManager$requestPinGlanceAppWidget$1 glanceAppWidgetManager$requestPinGlanceAppWidget$12 = glanceAppWidgetManager$requestPinGlanceAppWidget$1;
                Object obj2 = glanceAppWidgetManager$requestPinGlanceAppWidget$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = glanceAppWidgetManager$requestPinGlanceAppWidget$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (Build.VERSION.SDK_INT < 26) {
                        return Boxing.boxBoolean(false);
                    }
                    if (!AppWidgetManagerApi26Impl.INSTANCE.isRequestPinAppWidgetSupported(this.appWidgetManager)) {
                        return Boxing.boxBoolean(false);
                    }
                    componentName = new ComponentName(this.context.getPackageName(), cls.getName());
                    bundle = new Bundle();
                    if (glanceAppWidget == null) {
                        glanceAppWidgetManager = this;
                        return Boxing.boxBoolean(AppWidgetManagerApi26Impl.INSTANCE.requestPinAppWidget(glanceAppWidgetManager.appWidgetManager, componentName, bundle, pendingIntent));
                    }
                    for (AppWidgetProviderInfo appWidgetProviderInfo : this.appWidgetManager.getInstalledProviders()) {
                        if (Intrinsics.areEqual(appWidgetProviderInfo.provider, componentName)) {
                            Context context = this.context;
                            AppWidgetId appWidgetId = new AppWidgetId(0);
                            Bundle bundle3 = Bundle.EMPTY;
                            DpSize m1107boximpl = DpSize.m1107boximpl(AppWidgetUtilsKt.getMinSize(appWidgetProviderInfo, this.context.getResources().getDisplayMetrics()));
                            glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$0 = this;
                            glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$1 = pendingIntent;
                            glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$2 = componentName;
                            glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$3 = bundle;
                            glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$4 = bundle;
                            glanceAppWidgetManager$requestPinGlanceAppWidget$12.label = 1;
                            Object m1280composeDR8WLM = AppWidgetComposerKt.m1280composeDR8WLM(glanceAppWidget, context, appWidgetId, bundle3, m1107boximpl, obj, glanceAppWidgetManager$requestPinGlanceAppWidget$12);
                            if (m1280composeDR8WLM == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            glanceAppWidgetManager = this;
                            componentName2 = componentName;
                            obj2 = m1280composeDR8WLM;
                            bundle2 = bundle;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bundle = (Bundle) glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$4;
                bundle2 = (Bundle) glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$3;
                componentName2 = (ComponentName) glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$2;
                pendingIntent = (PendingIntent) glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$1;
                glanceAppWidgetManager = (GlanceAppWidgetManager) glanceAppWidgetManager$requestPinGlanceAppWidget$12.L$0;
                ResultKt.throwOnFailure(obj2);
                bundle.putParcelable("appWidgetPreview", (RemoteViews) obj2);
                bundle = bundle2;
                componentName = componentName2;
                return Boxing.boxBoolean(AppWidgetManagerApi26Impl.INSTANCE.requestPinAppWidget(glanceAppWidgetManager.appWidgetManager, componentName, bundle, pendingIntent));
            }
        }
        glanceAppWidgetManager$requestPinGlanceAppWidget$1 = new GlanceAppWidgetManager$requestPinGlanceAppWidget$1(this, continuation);
        GlanceAppWidgetManager$requestPinGlanceAppWidget$1 glanceAppWidgetManager$requestPinGlanceAppWidget$122 = glanceAppWidgetManager$requestPinGlanceAppWidget$1;
        Object obj22 = glanceAppWidgetManager$requestPinGlanceAppWidget$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceAppWidgetManager$requestPinGlanceAppWidget$122.label;
        if (i != 0) {
        }
        bundle.putParcelable("appWidgetPreview", (RemoteViews) obj22);
        bundle = bundle2;
        componentName = componentName2;
        return Boxing.boxBoolean(AppWidgetManagerApi26Impl.INSTANCE.requestPinAppWidget(glanceAppWidgetManager.appWidgetManager, componentName, bundle, pendingIntent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R extends GlanceAppWidgetReceiver, P extends GlanceAppWidget> Object updateReceiver$glance_appwidget_release(R r, P p, Continuation<? super Unit> continuation) {
        String canonicalName = r.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = p.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object updateData = getDataStore().updateData(new GlanceAppWidgetManager$updateReceiver$2(canonicalName, canonicalName2, null), continuation);
        return updateData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateData : Unit.INSTANCE;
    }

    public final GlanceId getGlanceIdBy(Intent configurationIntent) {
        Bundle extras = configurationIntent.getExtras();
        int i = extras != null ? extras.getInt("appWidgetId", 0) : 0;
        if (i == 0) {
            return null;
        }
        return new AppWidgetId(i);
    }
}
