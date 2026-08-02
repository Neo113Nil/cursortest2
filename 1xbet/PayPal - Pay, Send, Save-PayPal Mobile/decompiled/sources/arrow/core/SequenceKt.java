package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001aq\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u008b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042$\u0010\b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\r¢\u0006\u0004\b\t\u0010\u000e\u001a¥\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00050\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042*\u0010\b\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0011¢\u0006\u0004\b\t\u0010\u0012\u001a¿\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00060\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000f\"\u0004\b\u0006\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00050\u000420\u0010\b\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u0015¢\u0006\u0004\b\t\u0010\u0016\u001aÙ\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00070\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000f\"\u0004\b\u0006\u0010\u0013\"\u0004\b\u0007\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00050\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00060\u000426\u0010\b\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0019¢\u0006\u0004\b\t\u0010\u001a\u001aó\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\b0\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000f\"\u0004\b\u0006\u0010\u0013\"\u0004\b\u0007\u0010\u0017\"\u0004\b\b\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00050\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00060\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00070\u00042<\u0010\b\u001a8\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u001d¢\u0006\u0004\b\t\u0010\u001e\u001a\u008d\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\t0\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000f\"\u0004\b\u0006\u0010\u0013\"\u0004\b\u0007\u0010\u0017\"\u0004\b\b\u0010\u001b\"\u0004\b\t\u0010\u001f*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00050\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00060\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00070\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\b0\u00042B\u0010\b\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t0!¢\u0006\u0004\b\t\u0010\"\u001a§\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\n0\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000f\"\u0004\b\u0006\u0010\u0013\"\u0004\b\u0007\u0010\u0017\"\u0004\b\b\u0010\u001b\"\u0004\b\t\u0010\u001f\"\u0004\b\n\u0010#*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00050\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00060\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00070\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\b0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\t0\u00042H\u0010\b\u001aD\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n0%¢\u0006\u0004\b\t\u0010&\u001a]\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00028\u00020)¢\u0006\u0004\b,\u0010-\u001aC\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b,\u0010.\u001a\u0085\u0001\u00108\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010/\"\u0004\b\u0001\u00100\"\u0004\b\u0002\u001012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020)2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020)2\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000206H\u0002¢\u0006\u0004\b8\u00109\u001aI\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010;0;\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010:0)¢\u0006\u0004\b<\u0010=\u001aA\u0010>\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010;\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010)¢\u0006\u0004\b>\u0010=\u001a)\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010'*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004¢\u0006\u0004\b?\u0010@\u001a1\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\bB\u0010.\u001aY\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u0010C\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000206¢\u0006\u0004\bD\u0010E\u001aE\u0010D\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010F0\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\bD\u0010.\u001a)\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\bG\u0010@\u001a#\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\bH\u0010@\u001aG\u0010I\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010F0\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\bI\u0010.\u001a[\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u001c\u0010+\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u000206¢\u0006\u0004\bI\u0010E\u001aY\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u0010+\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u000206¢\u0006\u0004\bJ\u0010E\u001aE\u0010J\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010F0\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\bJ\u0010.\u001aK\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000006¢\u0006\u0004\bL\u0010E\u001aG\u0010N\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010;0F\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M0\u0004¢\u0006\u0004\bN\u0010O\u001a1\u0010P\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010F\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\bP\u0010O\u001a#\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\bQ\u0010@\u001az\u0010V\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020;0M\"\u0004\b\u0000\u0010R\"\u0004\b\u0001\u0010'\"\u0004\b\u0002\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000062#\u0010U\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000S\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000206¢\u0006\u0002\bT¢\u0006\u0004\bV\u0010W\u001af\u0010V\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000X\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020;0M\"\u0004\b\u0000\u0010R\"\u0004\b\u0001\u0010'\"\u0004\b\u0002\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042#\u0010U\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000S\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000206¢\u0006\u0002\bT¢\u0006\u0004\bV\u0010Y\u001aG\u0010Z\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040F\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0\u0004¢\u0006\u0004\bZ\u0010O\u001aa\u0010Z\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040F\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00020\u00042\u001e\u0010+\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)¢\u0006\u0004\bZ\u0010[\u001aE\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\\\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040)H\u0007¢\u0006\u0004\b]\u0010^\u001aG\u0010_\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040F\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010F0\u0004¢\u0006\u0004\b_\u0010O\u001aa\u0010_\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040F\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00020\u00042\u001e\u0010`\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010F0)¢\u0006\u0004\b_\u0010[\u001a)\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010'*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000a0\u0004¢\u0006\u0004\bb\u0010@"}, d2 = {"B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "E", "Lkotlin/sequences/Sequence;", "c", "d", "Lkotlin/Function3;", "map", "zip", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function3;)Lkotlin/sequences/Sequence;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "e", "Lkotlin/Function4;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function4;)Lkotlin/sequences/Sequence;", "G", "f", "Lkotlin/Function5;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function5;)Lkotlin/sequences/Sequence;", "H", "g", "Lkotlin/Function6;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function6;)Lkotlin/sequences/Sequence;", com.visa.cbp.getEncExpo.warmup, "h", "Lkotlin/Function7;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function7;)Lkotlin/sequences/Sequence;", "J", "i", "Lkotlin/Function8;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function8;)Lkotlin/sequences/Sequence;", "K", "j", "Lkotlin/Function9;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function9;)Lkotlin/sequences/Sequence;", "L", "k", "Lkotlin/Function10;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function10;)Lkotlin/sequences/Sequence;", "A", "seqB", "Lkotlin/Function1;", "Larrow/core/Ior;", "fa", "align", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN, "Y", "Z", "p0", "p1", "p2", "p3", "Lkotlin/Function2;", "p4", "getHighSpeedVideoFpsRanges", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "", "", "crosswalk", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "crosswalkNull", "flatten", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "other", "interleave", "fab", "leftPadZip", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "many", "once", "padZip", "rightPadZip", "combine", "salign", "Larrow/core/Either;", "separateEither", "(Lkotlin/sequences/Sequence;)Lkotlin/Pair;", "split", "tail", "Error", "Larrow/core/raise/RaiseAccumulate;", "Lkotlin/ExtensionFunctionType;", "transform", "mapOrAccumulate", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Larrow/core/Either;", "Larrow/core/NonEmptyList;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)Larrow/core/Either;", "unalign", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "ffa", "unweave", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "unzip", "fc", "Larrow/core/Option;", "filterOption"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SequenceKt {
    public static /* synthetic */ java.lang.Object $r8$lambda$M1AsrYUHfyt1AuijOx6hxuyvn0w(java.lang.Object obj) {
        return obj;
    }

    public static final <B, C, D, E> kotlin.sequences.Sequence<E> zip(final kotlin.sequences.Sequence<? extends B> sequence, final kotlin.sequences.Sequence<? extends C> sequence2, final kotlin.sequences.Sequence<? extends D> sequence3, final kotlin.jvm.functions.Function3<? super B, ? super C, ? super D, ? extends E> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        return new kotlin.sequences.Sequence<E>() { // from class: arrow.core.SequenceKt$zip$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<E> iterator() {
                return new arrow.core.SequenceKt$zip$1$1(kotlin.sequences.Sequence.this, sequence2, sequence3, function3);
            }
        };
    }

    public static final <B, C, D, E, F> kotlin.sequences.Sequence<F> zip(final kotlin.sequences.Sequence<? extends B> sequence, final kotlin.sequences.Sequence<? extends C> sequence2, final kotlin.sequences.Sequence<? extends D> sequence3, final kotlin.sequences.Sequence<? extends E> sequence4, final kotlin.jvm.functions.Function4<? super B, ? super C, ? super D, ? super E, ? extends F> function4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        return new kotlin.sequences.Sequence<F>() { // from class: arrow.core.SequenceKt$zip$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<F> iterator() {
                return new arrow.core.SequenceKt$zip$2$1(kotlin.sequences.Sequence.this, sequence2, sequence3, sequence4, function4);
            }
        };
    }

    public static final <B, C, D, E, F, G> kotlin.sequences.Sequence<G> zip(final kotlin.sequences.Sequence<? extends B> sequence, final kotlin.sequences.Sequence<? extends C> sequence2, final kotlin.sequences.Sequence<? extends D> sequence3, final kotlin.sequences.Sequence<? extends E> sequence4, final kotlin.sequences.Sequence<? extends F> sequence5, final kotlin.jvm.functions.Function5<? super B, ? super C, ? super D, ? super E, ? super F, ? extends G> function5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        return new kotlin.sequences.Sequence<G>() { // from class: arrow.core.SequenceKt$zip$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<G> iterator() {
                return new arrow.core.SequenceKt$zip$3$1(kotlin.sequences.Sequence.this, sequence2, sequence3, sequence4, sequence5, function5);
            }
        };
    }

    public static final <B, C, D, E, F, G, H> kotlin.sequences.Sequence<H> zip(final kotlin.sequences.Sequence<? extends B> sequence, final kotlin.sequences.Sequence<? extends C> sequence2, final kotlin.sequences.Sequence<? extends D> sequence3, final kotlin.sequences.Sequence<? extends E> sequence4, final kotlin.sequences.Sequence<? extends F> sequence5, final kotlin.sequences.Sequence<? extends G> sequence6, final kotlin.jvm.functions.Function6<? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? extends H> function6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function6, "");
        return new kotlin.sequences.Sequence<H>() { // from class: arrow.core.SequenceKt$zip$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<H> iterator() {
                return new arrow.core.SequenceKt$zip$4$1(kotlin.sequences.Sequence.this, sequence2, sequence3, sequence4, sequence5, sequence6, function6);
            }
        };
    }

    public static final <B, C, D, E, F, G, H, I> kotlin.sequences.Sequence<I> zip(final kotlin.sequences.Sequence<? extends B> sequence, final kotlin.sequences.Sequence<? extends C> sequence2, final kotlin.sequences.Sequence<? extends D> sequence3, final kotlin.sequences.Sequence<? extends E> sequence4, final kotlin.sequences.Sequence<? extends F> sequence5, final kotlin.sequences.Sequence<? extends G> sequence6, final kotlin.sequences.Sequence<? extends H> sequence7, final kotlin.jvm.functions.Function7<? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? extends I> function7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function7, "");
        return new kotlin.sequences.Sequence<I>() { // from class: arrow.core.SequenceKt$zip$$inlined$Sequence$5
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<I> iterator() {
                return new arrow.core.SequenceKt$zip$5$1(kotlin.sequences.Sequence.this, sequence2, sequence3, sequence4, sequence5, sequence6, sequence7, function7);
            }
        };
    }

    public static final <B, C, D, E, F, G, H, I, J> kotlin.sequences.Sequence<J> zip(final kotlin.sequences.Sequence<? extends B> sequence, final kotlin.sequences.Sequence<? extends C> sequence2, final kotlin.sequences.Sequence<? extends D> sequence3, final kotlin.sequences.Sequence<? extends E> sequence4, final kotlin.sequences.Sequence<? extends F> sequence5, final kotlin.sequences.Sequence<? extends G> sequence6, final kotlin.sequences.Sequence<? extends H> sequence7, final kotlin.sequences.Sequence<? extends I> sequence8, final kotlin.jvm.functions.Function8<? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? extends J> function8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function8, "");
        return new kotlin.sequences.Sequence<J>() { // from class: arrow.core.SequenceKt$zip$$inlined$Sequence$6
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<J> iterator() {
                return new arrow.core.SequenceKt$zip$6$1(kotlin.sequences.Sequence.this, sequence2, sequence3, sequence4, sequence5, sequence6, sequence7, sequence8, function8);
            }
        };
    }

    public static final <B, C, D, E, F, G, H, I, J, K> kotlin.sequences.Sequence<K> zip(final kotlin.sequences.Sequence<? extends B> sequence, final kotlin.sequences.Sequence<? extends C> sequence2, final kotlin.sequences.Sequence<? extends D> sequence3, final kotlin.sequences.Sequence<? extends E> sequence4, final kotlin.sequences.Sequence<? extends F> sequence5, final kotlin.sequences.Sequence<? extends G> sequence6, final kotlin.sequences.Sequence<? extends H> sequence7, final kotlin.sequences.Sequence<? extends I> sequence8, final kotlin.sequences.Sequence<? extends J> sequence9, final kotlin.jvm.functions.Function9<? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? super J, ? extends K> function9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function9, "");
        return new kotlin.sequences.Sequence<K>() { // from class: arrow.core.SequenceKt$zip$$inlined$Sequence$7
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<K> iterator() {
                return new arrow.core.SequenceKt$zip$7$1(kotlin.sequences.Sequence.this, sequence2, sequence3, sequence4, sequence5, sequence6, sequence7, sequence8, sequence9, function9);
            }
        };
    }

    public static final <B, C, D, E, F, G, H, I, J, K, L> kotlin.sequences.Sequence<L> zip(final kotlin.sequences.Sequence<? extends B> sequence, final kotlin.sequences.Sequence<? extends C> sequence2, final kotlin.sequences.Sequence<? extends D> sequence3, final kotlin.sequences.Sequence<? extends E> sequence4, final kotlin.sequences.Sequence<? extends F> sequence5, final kotlin.sequences.Sequence<? extends G> sequence6, final kotlin.sequences.Sequence<? extends H> sequence7, final kotlin.sequences.Sequence<? extends I> sequence8, final kotlin.sequences.Sequence<? extends J> sequence9, final kotlin.sequences.Sequence<? extends K> sequence10, final kotlin.jvm.functions.Function10<? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? super J, ? super K, ? extends L> function10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function10, "");
        return new kotlin.sequences.Sequence<L>() { // from class: arrow.core.SequenceKt$zip$$inlined$Sequence$8
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<L> iterator() {
                return new arrow.core.SequenceKt$zip$8$1(kotlin.sequences.Sequence.this, sequence2, sequence3, sequence4, sequence5, sequence6, sequence7, sequence8, sequence9, sequence10, function10);
            }
        };
    }

    public static final <A, B, C> kotlin.sequences.Sequence<C> align(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends B> sequence2, final kotlin.jvm.functions.Function1<? super arrow.core.Ior<? extends A, ? extends B>, ? extends C> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return getHighSpeedVideoFpsRanges(sequence, sequence2, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function1.this.invoke(new arrow.core.Ior.Left(obj));
                return invoke;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function1.this.invoke(new arrow.core.Ior.Right(obj));
                return invoke;
            }
        }, new kotlin.jvm.functions.Function2() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function1.this.invoke(new arrow.core.Ior.Both(obj, obj2));
                return invoke;
            }
        });
    }

    public static final <A, B> kotlin.sequences.Sequence<arrow.core.Ior<A, B>> align(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends B> sequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        return getHighSpeedVideoFpsRanges(sequence, sequence2, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return arrow.core.SequenceKt.m9682$r8$lambda$zDTx9TJCSKCLJfoaQut7aSwavo(obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return arrow.core.SequenceKt.m9673$r8$lambda$8Czf7mdk7UaifkSjzWYJ6zrkaY(obj);
            }
        }, new kotlin.jvm.functions.Function2() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return arrow.core.SequenceKt.m9677$r8$lambda$WU70lZ6BxJ8qhPNWZnHMb4sCv4(obj, obj2);
            }
        });
    }

    private static final <X, Y, Z> kotlin.sequences.Sequence<Z> getHighSpeedVideoFpsRanges(kotlin.sequences.Sequence<? extends X> sequence, kotlin.sequences.Sequence<? extends Y> sequence2, kotlin.jvm.functions.Function1<? super X, ? extends Z> function1, kotlin.jvm.functions.Function1<? super Y, ? extends Z> function12, kotlin.jvm.functions.Function2<? super X, ? super Y, ? extends Z> function2) {
        return kotlin.sequences.SequencesKt.sequence(new arrow.core.SequenceKt$alignRec$1(sequence.iterator(), sequence2.iterator(), function2, function1, function12, null));
    }

    public static final <A, B> java.util.List<java.util.List<B>> crosswalk(kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function1<? super A, ? extends java.lang.Iterable<? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.List<java.util.List<B>> emptyList = kotlin.collections.CollectionsKt.emptyList();
        java.util.Iterator<? extends A> it = sequence.iterator();
        while (it.hasNext()) {
            java.lang.Iterable<? extends B> invoke = function1.invoke(it.next());
            java.util.List<java.util.List<B>> list = emptyList;
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(java.lang.Math.max(arrow.core.IterableKt.collectionSizeOrDefault(invoke, 10), arrow.core.IterableKt.collectionSizeOrDefault(list, 10)));
            java.util.Iterator<? extends B> it2 = invoke.iterator();
            java.util.Iterator<T> it3 = list.iterator();
            while (true) {
                if (it2.hasNext() || it3.hasNext()) {
                    if (it2.hasNext() && it3.hasNext()) {
                        arrow.core.Ior.Both both = new arrow.core.Ior.Both(it2.next(), it3.next());
                        java.lang.Object leftValue = both.getLeftValue();
                        createListBuilder.add(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(leftValue), (java.lang.Iterable) both.getRightValue()));
                    } else if (it2.hasNext()) {
                        createListBuilder.add(kotlin.collections.CollectionsKt.listOf(new arrow.core.Ior.Left(it2.next()).getValue()));
                    } else if (it3.hasNext()) {
                        createListBuilder.add((java.util.List) new arrow.core.Ior.Right(it3.next()).getValue());
                    }
                }
            }
            emptyList = kotlin.collections.CollectionsKt.build(createListBuilder);
        }
        return emptyList;
    }

    public static final <A, B> java.util.List<B> crosswalkNull(kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function1<? super A, ? extends B> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.List<B> emptyList = kotlin.collections.CollectionsKt.emptyList();
        java.util.Iterator<? extends A> it = sequence.iterator();
        while (it.hasNext()) {
            arrow.core.Ior<A, B> fromNullables = arrow.core.Ior.INSTANCE.fromNullables(function1.invoke(it.next()), emptyList);
            if (fromNullables == null) {
                emptyList = null;
            } else if (fromNullables instanceof arrow.core.Ior.Left) {
                emptyList = kotlin.collections.CollectionsKt.listOf(((arrow.core.Ior.Left) fromNullables).getValue());
            } else if (fromNullables instanceof arrow.core.Ior.Right) {
                emptyList = (java.util.List) ((arrow.core.Ior.Right) fromNullables).getValue();
            } else if (fromNullables instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) fromNullables;
                java.lang.Object leftValue = both.getLeftValue();
                emptyList = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(leftValue), (java.lang.Iterable) both.getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return emptyList;
    }

    public static final <A> kotlin.sequences.Sequence<A> flatten(kotlin.sequences.Sequence<? extends kotlin.sequences.Sequence<? extends A>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.flatMap(sequence, arrow.core.SequenceKt$flatten$1.Camera2StreamConfigurationMap);
    }

    public static final <A> kotlin.sequences.Sequence<A> interleave(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends A> sequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        return kotlin.sequences.SequencesKt.sequence(new arrow.core.SequenceKt$interleave$1(sequence, sequence2, null));
    }

    public static final <A, B, C> kotlin.sequences.Sequence<C> leftPadZip(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends B> sequence2, final kotlin.jvm.functions.Function2<? super A, ? super B, ? extends C> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return kotlin.sequences.SequencesKt.mapNotNull(padZip(sequence, sequence2, new kotlin.jvm.functions.Function2() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return arrow.core.SequenceKt.m9678$r8$lambda$agPuWs6B10EYtUVZNnjMCzqhIA(kotlin.jvm.functions.Function2.this, obj, obj2);
            }
        }), arrow.core.SequenceKt$leftPadZip$2.getHighSpeedVideoFpsRanges);
    }

    public static final <A, B> kotlin.sequences.Sequence<kotlin.Pair<A, B>> leftPadZip(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends B> sequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        return leftPadZip(sequence, sequence2, new kotlin.jvm.functions.Function2() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Pair pair;
                pair = kotlin.TuplesKt.to(obj, obj2);
                return pair;
            }
        });
    }

    public static final <A> kotlin.sequences.Sequence<kotlin.sequences.Sequence<A>> many(kotlin.sequences.Sequence<? extends A> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.none(sequence) ? kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new kotlin.sequences.Sequence[]{kotlin.sequences.SequencesKt.emptySequence()}) : kotlin.sequences.SequencesKt.map(sequence, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.sequences.Sequence generateSequence;
                generateSequence = kotlin.sequences.SequencesKt.generateSequence(new kotlin.jvm.functions.Function0() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return arrow.core.SequenceKt.$r8$lambda$M1AsrYUHfyt1AuijOx6hxuyvn0w(obj);
                    }
                });
                return generateSequence;
            }
        });
    }

    public static final <A> kotlin.sequences.Sequence<A> once(kotlin.sequences.Sequence<? extends A> sequence) {
        kotlin.sequences.Sequence<A> sequenceOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.lang.Object firstOrNull = kotlin.sequences.SequencesKt.firstOrNull(sequence);
        return (firstOrNull == null || (sequenceOf = kotlin.sequences.SequencesKt.sequenceOf(firstOrNull)) == null) ? kotlin.sequences.SequencesKt.emptySequence() : sequenceOf;
    }

    public static final <A, B> kotlin.sequences.Sequence<kotlin.Pair<A, B>> padZip(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends B> sequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        return getHighSpeedVideoFpsRanges(sequence, sequence2, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return arrow.core.SequenceKt.m9674$r8$lambda$BE5hhMlRbkC5oba_jAy_dAu5xs(obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return arrow.core.SequenceKt.$r8$lambda$FbMSjcID6K6yj0mA7BduYK3BZcY(obj);
            }
        }, new kotlin.jvm.functions.Function2() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return arrow.core.SequenceKt.m9681$r8$lambda$pTzKePHQYE4w1y7fiyh4MQ6Y1A(obj, obj2);
            }
        });
    }

    public static final <A, B, C> kotlin.sequences.Sequence<C> padZip(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends B> sequence2, final kotlin.jvm.functions.Function2<? super A, ? super B, ? extends C> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return getHighSpeedVideoFpsRanges(sequence, sequence2, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function2.this.invoke(obj, null);
                return invoke;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function2.this.invoke(null, obj);
                return invoke;
            }
        }, new kotlin.jvm.functions.Function2() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function2.this.invoke(obj, obj2);
                return invoke;
            }
        });
    }

    public static final <A, B, C> kotlin.sequences.Sequence<C> rightPadZip(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends B> sequence2, final kotlin.jvm.functions.Function2<? super A, ? super B, ? extends C> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return leftPadZip(sequence2, sequence, new kotlin.jvm.functions.Function2() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function2.this.invoke(obj2, obj);
                return invoke;
            }
        });
    }

    public static final <A, B> kotlin.sequences.Sequence<kotlin.Pair<A, B>> rightPadZip(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends B> sequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        return rightPadZip(sequence, sequence2, new kotlin.jvm.functions.Function2() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Pair pair;
                pair = kotlin.TuplesKt.to(obj, obj2);
                return pair;
            }
        });
    }

    public static final <A> kotlin.sequences.Sequence<A> salign(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends A> sequence2, final kotlin.jvm.functions.Function2<? super A, ? super A, ? extends A> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return align(sequence, sequence2, new kotlin.jvm.functions.Function1() { // from class: arrow.core.SequenceKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return arrow.core.SequenceKt.$r8$lambda$Ha7Li_fzJvTamgpianboQYuu4go(kotlin.jvm.functions.Function2.this, (arrow.core.Ior) obj);
            }
        });
    }

    public static final <A, B> kotlin.Pair<java.util.List<A>, java.util.List<B>> separateEither(kotlin.sequences.Sequence<? extends arrow.core.Either<? extends A, ? extends B>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.Pair<java.util.List<A>, java.util.List<B>> pair = kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList());
        for (arrow.core.Either<? extends A, ? extends B> either : sequence) {
            java.util.List<A> component1 = pair.component1();
            java.util.List<B> component2 = pair.component2();
            if (either instanceof arrow.core.Either.Left) {
                pair = kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Object>) component1, ((arrow.core.Either.Left) either).getValue()), component2);
            } else {
                if (!(either instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                pair = kotlin.TuplesKt.to(component1, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Object>) component2, ((arrow.core.Either.Right) either).getValue()));
            }
        }
        return pair;
    }

    public static final <A> kotlin.Pair<kotlin.sequences.Sequence<A>, A> split(kotlin.sequences.Sequence<? extends A> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.lang.Object firstOrNull = kotlin.sequences.SequencesKt.firstOrNull(sequence);
        if (firstOrNull != null) {
            return new kotlin.Pair<>(tail(sequence), firstOrNull);
        }
        return null;
    }

    public static final <A> kotlin.sequences.Sequence<A> tail(kotlin.sequences.Sequence<? extends A> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.drop(sequence, 1);
    }

    public static final <A, B> kotlin.Pair<kotlin.sequences.Sequence<A>, kotlin.sequences.Sequence<B>> unalign(kotlin.sequences.Sequence<? extends arrow.core.Ior<? extends A, ? extends B>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.Pair<kotlin.sequences.Sequence<A>, kotlin.sequences.Sequence<B>> pair = kotlin.TuplesKt.to(kotlin.sequences.SequencesKt.emptySequence(), kotlin.sequences.SequencesKt.emptySequence());
        for (arrow.core.Ior<? extends A, ? extends B> ior : sequence) {
            kotlin.sequences.Sequence<A> component1 = pair.component1();
            kotlin.sequences.Sequence<B> component2 = pair.component2();
            if (ior instanceof arrow.core.Ior.Left) {
                pair = kotlin.TuplesKt.to(kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends java.lang.Object>) component1, ((arrow.core.Ior.Left) ior).getValue()), component2);
            } else if (ior instanceof arrow.core.Ior.Right) {
                pair = kotlin.TuplesKt.to(component1, kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends java.lang.Object>) component2, ((arrow.core.Ior.Right) ior).getValue()));
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                pair = kotlin.TuplesKt.to(kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends java.lang.Object>) component1, both.getLeftValue()), kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends java.lang.Object>) component2, both.getRightValue()));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return pair;
    }

    public static final <A, B, C> kotlin.Pair<kotlin.sequences.Sequence<A>, kotlin.sequences.Sequence<B>> unalign(kotlin.sequences.Sequence<? extends C> sequence, kotlin.jvm.functions.Function1<? super C, ? extends arrow.core.Ior<? extends A, ? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return unalign(kotlin.sequences.SequencesKt.map(sequence, function1));
    }

    @kotlin.Deprecated(message = "To be removed due to unclear semantics. Please report use cases at https://github.com/arrow-kt/arrow/issues/3675.")
    public static final <A, B> kotlin.sequences.Sequence<B> unweave(kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function1<? super A, ? extends kotlin.sequences.Sequence<? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.Pair split = split(sequence);
        if (split != null) {
            kotlin.sequences.Sequence<B> interleave = interleave(function1.invoke((java.lang.Object) split.component2()), unweave((kotlin.sequences.Sequence) split.component1(), function1));
            if (interleave != null) {
                return interleave;
            }
        }
        return kotlin.sequences.SequencesKt.emptySequence();
    }

    public static final <A, B> kotlin.Pair<kotlin.sequences.Sequence<A>, kotlin.sequences.Sequence<B>> unzip(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends A, ? extends B>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.Pair<kotlin.sequences.Sequence<A>, kotlin.sequences.Sequence<B>> pair = kotlin.TuplesKt.to(kotlin.sequences.SequencesKt.emptySequence(), kotlin.sequences.SequencesKt.emptySequence());
        for (kotlin.Pair<? extends A, ? extends B> pair2 : sequence) {
            pair = kotlin.TuplesKt.to(kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends A>) pair.component1(), pair2.getFirst()), kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends B>) pair.component2(), pair2.getSecond()));
        }
        return pair;
    }

    public static final <A, B, C> kotlin.Pair<kotlin.sequences.Sequence<A>, kotlin.sequences.Sequence<B>> unzip(kotlin.sequences.Sequence<? extends C> sequence, kotlin.jvm.functions.Function1<? super C, ? extends kotlin.Pair<? extends A, ? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return unzip(kotlin.sequences.SequencesKt.map(sequence, function1));
    }

    public static final <A> kotlin.sequences.Sequence<A> filterOption(kotlin.sequences.Sequence<? extends arrow.core.Option<? extends A>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return kotlin.sequences.SequencesKt.sequence(new arrow.core.SequenceKt$filterOption$1(sequence, null));
    }

    public static final <Error, A, B> arrow.core.Either<Error, java.util.List<B>> mapOrAccumulate(kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function22) {
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        boolean z = false;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.RaiseAccumulate raiseAccumulate = new arrow.core.raise.RaiseAccumulate(defaultRaise3);
                for (A a2 : sequence) {
                    arrow.core.raise.RaiseAccumulate raiseAccumulate2 = raiseAccumulate;
                    arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(z);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                        arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(z);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise6;
                            arrow.core.raise.RaiseAccumulate raiseAccumulate3 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise5), defaultRaise7, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise7));
                            boolean hasErrors = raiseAccumulate3.hasErrors();
                            B invoke = function22.invoke(raiseAccumulate3, a2);
                            if (!hasErrors) {
                                createListBuilder.add(invoke);
                            }
                            raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                            defaultRaise6.complete();
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            defaultRaise6.complete();
                            raisedOrRethrow = raiseAccumulate2.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise6)).getAll());
                        } catch (java.lang.Throwable th) {
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                        defaultRaise4.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        defaultRaise4.complete();
                        raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise4);
                    } catch (java.lang.Throwable th2) {
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
                    }
                    z = false;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (raiseAccumulate.hasErrors() && (latestError = raiseAccumulate.getLatestError()) != null) {
                    latestError.getValue();
                    throw new kotlin.KotlinNothingValueException();
                }
                java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                defaultRaise.complete();
                return new arrow.core.Either.Right(build);
            } catch (arrow.core.raise.RaiseCancellationException e3) {
                defaultRaise3.complete();
                java.util.Iterator<E> it = arrow.core.NonEmptyList.m9567boximpl(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise3)).getAll()).iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Error error = (java.lang.Object) it.next();
                while (it.hasNext()) {
                    error = function2.invoke(error, (java.lang.Object) it.next());
                }
                defaultRaise2.raise(error);
                throw new kotlin.KotlinNothingValueException();
            } catch (java.lang.Throwable th3) {
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th3);
            }
        } catch (arrow.core.raise.RaiseCancellationException e4) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e4, defaultRaise));
        } finally {
            defaultRaise.complete();
            java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final <Error, A, B> arrow.core.Either<arrow.core.NonEmptyList<Error>, java.util.List<B>> mapOrAccumulate(kotlin.sequences.Sequence<? extends A> sequence, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<Error>, ? super A, ? extends B> function2) {
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            arrow.core.raise.RaiseAccumulate raiseAccumulate = new arrow.core.raise.RaiseAccumulate(defaultRaise);
            for (A a2 : sequence) {
                arrow.core.raise.RaiseAccumulate raiseAccumulate2 = raiseAccumulate;
                arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                    arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                        arrow.core.raise.RaiseAccumulate raiseAccumulate3 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise3), defaultRaise5, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise5));
                        boolean hasErrors = raiseAccumulate3.hasErrors();
                        B invoke = function2.invoke(raiseAccumulate3, a2);
                        if (!hasErrors) {
                            createListBuilder.add(invoke);
                        }
                        raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise4.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise4.complete();
                        raisedOrRethrow = raiseAccumulate2.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise4)).getAll());
                    } catch (java.lang.Throwable th) {
                        defaultRaise4.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    defaultRaise2.complete();
                } catch (arrow.core.raise.RaiseCancellationException e2) {
                    defaultRaise2.complete();
                    raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise2);
                } catch (java.lang.Throwable th2) {
                    defaultRaise2.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (raiseAccumulate.hasErrors() && (latestError = raiseAccumulate.getLatestError()) != null) {
                latestError.getValue();
                throw new kotlin.KotlinNothingValueException();
            }
            java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
            defaultRaise.complete();
            return new arrow.core.Either.Right(build);
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise));
        } catch (java.lang.Throwable th3) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th3);
        }
    }

    /* renamed from: $r8$lambda$8Czf7md-k7UaifkSjzWYJ6zrkaY, reason: not valid java name */
    public static /* synthetic */ arrow.core.Ior m9673$r8$lambda$8Czf7mdk7UaifkSjzWYJ6zrkaY(java.lang.Object obj) {
        return new arrow.core.Ior.Right(obj);
    }

    /* renamed from: $r8$lambda$BE5hhMlRb-kC5oba_jAy_dAu5xs, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m9674$r8$lambda$BE5hhMlRbkC5oba_jAy_dAu5xs(java.lang.Object obj) {
        return new kotlin.Pair(obj, null);
    }

    public static /* synthetic */ kotlin.Pair $r8$lambda$FbMSjcID6K6yj0mA7BduYK3BZcY(java.lang.Object obj) {
        return new kotlin.Pair(null, obj);
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$Ha7Li_fzJvTamgpianboQYuu4go(kotlin.jvm.functions.Function2 function2, arrow.core.Ior ior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        if (ior instanceof arrow.core.Ior.Left) {
            return ((arrow.core.Ior.Left) ior).getValue();
        }
        if (ior instanceof arrow.core.Ior.Right) {
            return ((arrow.core.Ior.Right) ior).getValue();
        }
        if (!(ior instanceof arrow.core.Ior.Both)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
        return function2.invoke(both.getLeftValue(), both.getRightValue());
    }

    /* renamed from: $r8$lambda$WU7-0lZ6BxJ8qhPNWZnHMb4sCv4, reason: not valid java name */
    public static /* synthetic */ arrow.core.Ior m9677$r8$lambda$WU70lZ6BxJ8qhPNWZnHMb4sCv4(java.lang.Object obj, java.lang.Object obj2) {
        return new arrow.core.Ior.Both(obj, obj2);
    }

    /* renamed from: $r8$lambda$a-gPuWs6B10EYtUVZNnjMCzqhIA, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m9678$r8$lambda$agPuWs6B10EYtUVZNnjMCzqhIA(kotlin.jvm.functions.Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 != null) {
            return function2.invoke(obj, obj2);
        }
        return null;
    }

    /* renamed from: $r8$lambda$pTzKePHQYE4w1-y7fiyh4MQ6Y1A, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m9681$r8$lambda$pTzKePHQYE4w1y7fiyh4MQ6Y1A(java.lang.Object obj, java.lang.Object obj2) {
        return new kotlin.Pair(obj, obj2);
    }

    /* renamed from: $r8$lambda$zDTx9T-JCSKCLJfoaQut7aSwavo, reason: not valid java name */
    public static /* synthetic */ arrow.core.Ior m9682$r8$lambda$zDTx9TJCSKCLJfoaQut7aSwavo(java.lang.Object obj) {
        return new arrow.core.Ior.Left(obj);
    }
}
