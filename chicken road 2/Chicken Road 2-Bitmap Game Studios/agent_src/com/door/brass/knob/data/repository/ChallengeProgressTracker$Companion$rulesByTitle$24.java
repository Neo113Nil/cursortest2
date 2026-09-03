package com.door.brass.knob.data.repository;

import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.repository.ChallengeProgressTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class ChallengeProgressTracker$Companion$rulesByTitle$24 extends FunctionReferenceImpl implements Function1<MenuItemEntity, String> {
    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
        menuItemEntity.getClass();
        return ChallengeProgressTracker.Companion.hRNgd2zGCE5kj((ChallengeProgressTracker.Companion) this.b41X89IqSbKt, menuItemEntity);
    }
}
