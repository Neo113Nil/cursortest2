package Ve;

import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.domain.model.response.UserInfo;

/* loaded from: classes10.dex */
public final class Uj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30130d;

    public Uj() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Uj uj2 = new Uj(2, dVar);
        uj2.f30130d = obj;
        return uj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Uj uj2 = new Uj(2, (kotlin.coroutines.d) obj2);
        uj2.f30130d = (UserInfo) obj;
        return uj2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        UserInfo userInfo = (UserInfo) this.f30130d;
        int i11 = R.string.spay_user_name_pattern;
        Object[] args = {userInfo.getFirstName(), userInfo.getLastName()};
        Intrinsics.checkNotNullParameter(args, "args");
        Pq pq = new Pq(i11, C7705l.f0(args));
        Integer gender = userInfo.getGender();
        return new C4505oi(pq, (gender != null && gender.intValue() == 1) ? R.drawable.spay_img_ava_male_4x : (gender != null && gender.intValue() == 2) ? R.drawable.spay_img_ava_female_4x : R.drawable.spay_img_ava_neutral_4x, userInfo.getMobilePhone());
    }
}
