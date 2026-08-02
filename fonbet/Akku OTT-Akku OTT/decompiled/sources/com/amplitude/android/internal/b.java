package com.amplitude.android.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.amplitude.android.internal.c;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;

@SourceDebugExtension({"SMAP\nViewHierarchyScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHierarchyScanner.kt\ncom/amplitude/android/internal/ViewHierarchyScanner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1#2:100\n1747#3,3:101\n*S KotlinDebug\n*F\n+ 1 ViewHierarchyScanner.kt\ncom/amplitude/android/internal/ViewHierarchyScanner\n*L\n78#1:101,3\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    public static final c a(View view, Pair pair, List list, com.amplitude.common.a aVar) {
        View view2;
        boolean z;
        c.a aVar2 = c.a.a;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        c cVar = null;
        while (!arrayDeque.isEmpty()) {
            try {
                view2 = (View) arrayDeque.removeFirst();
                if (view2 instanceof ViewGroup) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayDeque, ViewGroupKt.getChildren((ViewGroup) view2));
                }
            } catch (NoSuchElementException unused) {
                aVar.b("Unable to get view from queue");
            }
            if (list != null) {
                try {
                } catch (ClassCastException e) {
                    aVar.b("Error while locating target in view hierarchy: " + e);
                }
                if (!list.isEmpty()) {
                }
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c a = ((com.amplitude.android.internal.locators.b) it.next()).a(view2, pair);
                if (a != null) {
                    c.a aVar3 = c.a.a;
                    z = true;
                } else {
                    a = cVar;
                    z = false;
                }
                if (z) {
                    cVar = a;
                    break;
                }
                cVar = a;
            }
        }
        return cVar;
    }

    @JvmStatic
    public static final c b(View view, Pair targetPosition, List viewTargetLocators, com.amplitude.common.a logger) {
        c.a targetType = c.a.a;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(targetPosition, "targetPosition");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return (c) C1082i.d(EmptyCoroutineContext.INSTANCE, new a(view, logger, viewTargetLocators, targetPosition, null));
    }
}
