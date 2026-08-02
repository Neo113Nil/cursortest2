package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.g;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.flow.C1062g;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.InterfaceC1061f;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010 \u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\"\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010#\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160$2\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J \u0010%\u001a\u00020\r2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020)0(2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001f\u0010*\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010+J\u001f\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010-J\u001f\u0010.\u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010/J\u001a\u00100\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u00103\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160$2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J*\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020)0(2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$H\u0082@¢\u0006\u0002\u00106J\u001a\u00107\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u000309\u0018\u000108H\u0082@¢\u0006\u0002\u0010:J\u001c\u0010;\u001a\u0004\u0018\u00010)2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u000309H\u0082@¢\u0006\u0002\u0010<R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "<init>", "()V", "listEncoder", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "(Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "context", "Landroid/content/Context;", "backend", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "setUp", "", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "onAttachedToEngine", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "setBool", Constants.KEY, "", "value", "", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "setString", "dataStoreSetString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInt", "", "setDouble", "", "setEncodedStringList", "setDeprecatedStringList", "", "clear", "allowList", "getAll", "", "", "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getString", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "getPlatformEncodedStringList", "getKeys", "getPrefs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAllKeys", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValueByKey", "(Landroidx/datastore/preferences/core/Preferences$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_preferences_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,520:1\n812#2,12:521\n1915#2,2:533\n49#3:535\n51#3:539\n49#3:540\n51#3:544\n46#4:536\n51#4:538\n46#4:541\n51#4:543\n105#5:537\n105#5:542\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin\n*L\n237#1:521,12\n257#1:533,2\n270#1:535\n270#1:539\n275#1:540\n275#1:544\n270#1:536\n270#1:538\n275#1:541\n275#1:543\n270#1:537\n275#1:542\n*E\n"})
/* loaded from: classes3.dex */
public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {
    private SharedPreferencesBackend backend;
    private Context context;
    private SharedPreferencesListEncoder listEncoder;

    public SharedPreferencesPlugin() {
        this.listEncoder = new ListEncoder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dataStoreSetString(String str, String str2, Continuation<? super Unit> continuation) {
        Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        Object edit = PreferencesKt.edit(SharedPreferencesPluginKt.getSharedPreferencesDataStore(context), new SharedPreferencesPlugin$dataStoreSetString$2(stringKey, str2, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d5, code lost:
    
        if (r15 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00d5 -> B:11:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPrefs(List<String> list, Continuation<? super Map<String, ? extends Object>> continuation) {
        SharedPreferencesPlugin$getPrefs$1 sharedPreferencesPlugin$getPrefs$1;
        int i;
        Set set;
        List<String> list2;
        Map map;
        Set set2;
        Set set3;
        Map map2;
        Set set4;
        int i2;
        List<String> list3;
        Iterator it;
        Set set5;
        Object transformPref;
        if (continuation instanceof SharedPreferencesPlugin$getPrefs$1) {
            sharedPreferencesPlugin$getPrefs$1 = (SharedPreferencesPlugin$getPrefs$1) continuation;
            int i3 = sharedPreferencesPlugin$getPrefs$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sharedPreferencesPlugin$getPrefs$1.label = i3 - Integer.MIN_VALUE;
                Object obj = sharedPreferencesPlugin$getPrefs$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sharedPreferencesPlugin$getPrefs$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    set = list != null ? CollectionsKt.toSet(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    sharedPreferencesPlugin$getPrefs$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                    sharedPreferencesPlugin$getPrefs$1.L$1 = set;
                    sharedPreferencesPlugin$getPrefs$1.L$2 = linkedHashMap;
                    sharedPreferencesPlugin$getPrefs$1.label = 1;
                    Object readAllKeys = readAllKeys(sharedPreferencesPlugin$getPrefs$1);
                    if (readAllKeys != coroutine_suspended) {
                        list2 = list;
                        map = linkedHashMap;
                        obj = readAllKeys;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    map = (Map) sharedPreferencesPlugin$getPrefs$1.L$2;
                    set = (Set) sharedPreferencesPlugin$getPrefs$1.L$1;
                    list2 = (List) sharedPreferencesPlugin$getPrefs$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = sharedPreferencesPlugin$getPrefs$1.I$0;
                    Preferences.Key<?> key = (Preferences.Key) sharedPreferencesPlugin$getPrefs$1.L$7;
                    it = (Iterator) sharedPreferencesPlugin$getPrefs$1.L$5;
                    set3 = (Iterable) sharedPreferencesPlugin$getPrefs$1.L$4;
                    set5 = (Set) sharedPreferencesPlugin$getPrefs$1.L$3;
                    map2 = (Map) sharedPreferencesPlugin$getPrefs$1.L$2;
                    set4 = (Set) sharedPreferencesPlugin$getPrefs$1.L$1;
                    list3 = (List) sharedPreferencesPlugin$getPrefs$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (SharedPreferencesPluginKt.preferencesFilter(key.toString(), obj, set4) && (transformPref = SharedPreferencesPluginKt.transformPref(obj, this.listEncoder)) != null) {
                        map2.put(key.toString(), transformPref);
                    }
                    if (it.hasNext()) {
                        return map2;
                    }
                    Object next = it.next();
                    key = (Preferences.Key) next;
                    sharedPreferencesPlugin$getPrefs$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                    sharedPreferencesPlugin$getPrefs$1.L$1 = set4;
                    sharedPreferencesPlugin$getPrefs$1.L$2 = map2;
                    sharedPreferencesPlugin$getPrefs$1.L$3 = SpillingKt.nullOutSpilledVariable(set5);
                    sharedPreferencesPlugin$getPrefs$1.L$4 = SpillingKt.nullOutSpilledVariable(set3);
                    sharedPreferencesPlugin$getPrefs$1.L$5 = it;
                    sharedPreferencesPlugin$getPrefs$1.L$6 = SpillingKt.nullOutSpilledVariable(next);
                    sharedPreferencesPlugin$getPrefs$1.L$7 = key;
                    sharedPreferencesPlugin$getPrefs$1.I$0 = i2;
                    sharedPreferencesPlugin$getPrefs$1.I$1 = 0;
                    sharedPreferencesPlugin$getPrefs$1.label = 2;
                    obj = getValueByKey(key, sharedPreferencesPlugin$getPrefs$1);
                }
                set2 = (Set) obj;
                if (set2 != null) {
                    return map;
                }
                set3 = set2;
                map2 = map;
                set4 = set;
                i2 = 0;
                list3 = list2;
                it = set3.iterator();
                set5 = set2;
                if (it.hasNext()) {
                }
            }
        }
        sharedPreferencesPlugin$getPrefs$1 = new SharedPreferencesPlugin$getPrefs$1(this, continuation);
        Object obj2 = sharedPreferencesPlugin$getPrefs$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sharedPreferencesPlugin$getPrefs$1.label;
        if (i != 0) {
        }
        set2 = (Set) obj2;
        if (set2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getValueByKey(final Preferences.Key<?> key, Continuation<Object> continuation) {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        final InterfaceC1060e<Preferences> data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
        return C1062g.g(new InterfaceC1060e<Object>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin\n*L\n1#1,49:1\n50#2:50\n275#3:51\n*E\n"})
            /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC1061f {
                final /* synthetic */ Preferences.Key $key$inlined;
                final /* synthetic */ InterfaceC1061f $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC1061f interfaceC1061f, Preferences.Key key) {
                    this.$this_unsafeFlow = interfaceC1061f;
                    this.$key$inlined = key;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC1061f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC1061f interfaceC1061f = this.$this_unsafeFlow;
                                Object obj3 = ((Preferences) obj).get(this.$key$inlined);
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC1061f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC1061f.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC1060e
            public Object collect(InterfaceC1061f<? super Object> interfaceC1061f, Continuation continuation2) {
                Object collect = InterfaceC1060e.this.collect(new AnonymousClass2(interfaceC1061f, key), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readAllKeys(Continuation<? super Set<? extends Preferences.Key<?>>> continuation) {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        final InterfaceC1060e<Preferences> data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
        return C1062g.g(new InterfaceC1060e<Set<? extends Preferences.Key<?>>>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin\n*L\n1#1,49:1\n50#2:50\n270#3:51\n*E\n"})
            /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC1061f {
                final /* synthetic */ InterfaceC1061f $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC1061f interfaceC1061f) {
                    this.$this_unsafeFlow = interfaceC1061f;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC1061f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC1061f interfaceC1061f = this.$this_unsafeFlow;
                                Set<Preferences.Key<?>> keySet = ((Preferences) obj).asMap().keySet();
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC1061f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC1061f.emit(keySet, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC1060e
            public Object collect(InterfaceC1061f<? super Set<? extends Preferences.Key<?>>> interfaceC1061f, Continuation continuation2) {
                Object collect = InterfaceC1060e.this.collect(new AnonymousClass2(interfaceC1061f), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, continuation);
    }

    private final void setUp(BinaryMessenger messenger, Context context) {
        this.context = context;
        try {
            SharedPreferencesAsyncApi.INSTANCE.setUp(messenger, this, "data_store");
            this.backend = new SharedPreferencesBackend(messenger, context, this.listEncoder);
        } catch (Exception unused) {
        }
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(List<String> allowList, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$clear$1(this, allowList, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Map<String, Object> getAll(List<String> allowList, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return (Map) C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$getAll$1(this, allowList, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Boolean getBool(String key, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$getBool$1(key, this, objectRef, null));
        return (Boolean) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Double getDouble(String key, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$getDouble$1(key, this, objectRef, null));
        return (Double) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Long getInt(String key, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$getInt$1(key, this, objectRef, null));
        return (Long) objectRef.element;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getKeys(List<String> allowList, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return CollectionsKt.toList(((Map) C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$getKeys$prefs$1(this, allowList, null))).keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) {
        boolean startsWith$default;
        boolean startsWith$default2;
        List list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        String string = getString(key, options);
        if (string == null) {
            return null;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, null);
        if (startsWith$default) {
            return null;
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, null);
        if (!startsWith$default2 || (list = (List) SharedPreferencesPluginKt.transformPref(string, this.listEncoder)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public String getString(String key, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$getString$1(key, this, objectRef, null));
        return (String) objectRef.element;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) {
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        String string = getString(key, options);
        if (string == null) {
            return null;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, null);
        if (startsWith$default) {
            return new StringListResult(string, StringListLookupResultType.JSON_ENCODED);
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, null);
        return startsWith$default2 ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        setUp(binaryMessenger, applicationContext);
        new LegacySharedPreferencesPlugin().onAttachedToEngine(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.INSTANCE;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, null, "data_store");
        SharedPreferencesBackend sharedPreferencesBackend = this.backend;
        if (sharedPreferencesBackend != null) {
            sharedPreferencesBackend.tearDown();
        }
        this.backend = null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(String key, boolean value, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$setBool$1(key, this, value, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Deprecated(message = "This is just for testing, use `setEncodedStringList`")
    public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$setDeprecatedStringList$1(this, key, g.a(SharedPreferencesPluginKt.LIST_PREFIX, this.listEncoder.encode(value)), null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(String key, double value, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$setDouble$1(key, this, value, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$setEncodedStringList$1(this, key, value, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(String key, long value, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$setInt$1(key, this, value, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(String key, String value, SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        C1082i.d(EmptyCoroutineContext.INSTANCE, new SharedPreferencesPlugin$setString$1(this, key, value, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public SharedPreferencesPlugin(SharedPreferencesListEncoder listEncoder) {
        this();
        Intrinsics.checkNotNullParameter(listEncoder, "listEncoder");
        this.listEncoder = listEncoder;
    }
}
