package m1;

import D0.m;

/* renamed from: m1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1430e extends m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1430e(D0.j jVar, int i7) {
        super(jVar);
        this.f15210d = i7;
    }

    @Override // D0.m
    public final String b() {
        switch (this.f15210d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 1:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 2:
                return "DELETE FROM WorkProgress";
            case 3:
                return "DELETE FROM workspec WHERE id=?";
            case 4:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 5:
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            case 6:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 7:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 8:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            default:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }
}
