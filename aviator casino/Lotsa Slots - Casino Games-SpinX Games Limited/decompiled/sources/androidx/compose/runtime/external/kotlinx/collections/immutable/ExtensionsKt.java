package androidx.compose.runtime.external.kotlinx.collections.immutable;

/* compiled from: extensions.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aQ\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001¢\u0006\u0002\u0010\f\u001a\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\nH\u0001\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001¢\u0006\u0002\u0010\u000f\u001aQ\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0001\u001a-\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001¢\u0006\u0002\u0010\f\u001a \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0000\u001aQ\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000¢\u0006\u0002\u0010\f\u001a\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\nH\u0000\u001a-\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000¢\u0006\u0002\u0010\u000f\u001a \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0000\u001aQ\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000¢\u0006\u0002\u0010\f\u001a-\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0004\u001a-\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0004\u001a,\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010\u001c\u001a4\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010\u001d\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001a,\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010\u001f\u001a4\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010 \u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001a@\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0080\u0002¢\u0006\u0002\u0010\"\u001aH\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005H\u0080\u0002¢\u0006\u0002\u0010$\u001aA\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0019H\u0080\u0002\u001aA\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0080\u0002\u001a,\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010%\u001a4\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010&\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001a9\u0010'\u001a\b\u0012\u0004\u0012\u0002H(0\u000e\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u000e2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0+\u0012\u0004\u0012\u00020,0*H\u0080\b\u001aS\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030-\u0012\u0004\u0012\u00020,0*H\u0080\b\u001a9\u0010'\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0.\u0012\u0004\u0012\u00020,0*H\u0080\b\u001a,\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010\u001c\u001a4\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010\u001d\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001a,\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010\u001f\u001a4\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010 \u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001aT\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0080\n¢\u0006\u0002\u00100\u001aG\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0080\n\u001aM\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0019H\u0080\n\u001aI\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u00102\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0080\n\u001aM\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u001eH\u0080\n\u001a,\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010%\u001a4\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010&\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001aS\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0000¢\u0006\u0002\u00100\u001aL\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0019H\u0000\u001aH\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u00102\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001aL\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u001eH\u0000\u001a\u0012\u00105\u001a\b\u0012\u0004\u0012\u00020706*\u000208H\u0000\u001a\u001e\u00105\u001a\b\u0012\u0004\u0012\u0002H(06\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u00105\u001a\b\u0012\u0004\u0012\u0002H(06\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000\u001a0\u00109\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030:\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001a\u0012\u0010;\u001a\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001a\u001e\u0010;\u001a\b\u0012\u0004\u0012\u0002H(0<\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u0010;\u001a\b\u0012\u0004\u0012\u0002H(0<\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000\u001a0\u0010=\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001a\u0012\u0010>\u001a\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001a\u001e\u0010>\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u0010>\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000\u001a\u0012\u0010?\u001a\b\u0012\u0004\u0012\u0002070\u000e*\u000208H\u0000\u001a\u001e\u0010?\u001a\b\u0012\u0004\u0012\u0002H(0\u000e\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u0010?\u001a\b\u0012\u0004\u0012\u0002H(0\u000e\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000\u001a0\u0010@\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001a\u0012\u0010A\u001a\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001a\u001e\u0010A\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u0010A\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000¨\u0006B"}, d2 = {"immutableHashMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "immutableHashSetOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "immutableListOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "immutableMapOf", "immutableSetOf", "persistentHashMapOf", "persistentHashSetOf", "persistentListOf", "persistentMapOf", "persistentSetOf", "intersect", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "", "minus", "element", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Lkotlin/sequences/Sequence;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", com.ironsource.X3.i.W, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "mutate", "T", "mutator", "Lkotlin/Function1;", "", "", "", "", "plus", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "pair", "map", "", "putAll", "toImmutableList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "", "toImmutableMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "toImmutableSet", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "toPersistentHashMap", "toPersistentHashSet", "toPersistentList", "toPersistentMap", "toPersistentSet", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<T> mutate(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends T> persistentSet, kotlin.jvm.functions.Function1<? super java.util.Set<T>, kotlin.Unit> function1) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> mutate(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> persistentList, kotlin.jvm.functions.Function1<? super java.util.List<T>, kotlin.Unit> function1) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<? extends T> builder = persistentList.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> mutate(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        function1.invoke(builder2);
        return builder2.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, E e) {
        return persistentCollection.add((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, E e) {
        return persistentCollection.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E>) e);
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return persistentCollection.addAll((java.util.Collection<? extends java.lang.Object>) iterable);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        kotlin.collections.CollectionsKt.addAll(builder, iterable);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        kotlin.collections.CollectionsKt.addAll(builder, eArr);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, kotlin.sequences.Sequence<? extends E> sequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        kotlin.collections.CollectionsKt.addAll(builder, sequence);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return persistentCollection.removeAll((java.util.Collection<? extends java.lang.Object>) iterable);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, iterable);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, eArr);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, kotlin.sequences.Sequence<? extends E> sequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, sequence);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, E e) {
        return persistentList.add((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, E e) {
        return persistentList.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E>) e);
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return persistentList.addAll((java.util.Collection<? extends java.lang.Object>) iterable);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<? extends E> builder = persistentList.builder();
        kotlin.collections.CollectionsKt.addAll(builder, iterable);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return persistentList.removeAll((java.util.Collection<? extends java.lang.Object>) iterable);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<? extends E> builder = persistentList.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, E e) {
        return persistentSet.add((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, E e) {
        return persistentSet.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E>) e);
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return persistentSet.addAll((java.util.Collection<? extends java.lang.Object>) iterable);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        kotlin.collections.CollectionsKt.addAll(builder, iterable);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return persistentSet.removeAll((java.util.Collection<? extends java.lang.Object>) iterable);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, iterable);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> intersect(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return persistentSet.retainAll((java.util.Collection<? extends java.lang.Object>) iterable);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        kotlin.collections.CollectionsKt.retainAll(builder, iterable);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> intersect(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<? extends E> persistentCollection, java.lang.Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(persistentCollection), (java.lang.Iterable) iterable);
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, kotlin.Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return persistentMap.put((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V>) pair.getFirst(), (K) pair.getSecond());
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        return putAll(persistentMap, iterable);
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, kotlin.Pair<? extends K, ? extends V>[] pairArr) {
        return putAll(persistentMap, pairArr);
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence) {
        return putAll(persistentMap, sequence);
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, java.util.Map<? extends K, ? extends V> map) {
        return putAll(persistentMap, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> putAll(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, java.util.Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return persistentMap.putAll((java.util.Map<? extends java.lang.Object, ? extends java.lang.Object>) map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, K k) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return persistentMap.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V>) k);
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> persistentListOf(E... eArr) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.persistentVectorOf().addAll((java.util.Collection) kotlin.collections.ArraysKt.asList(eArr));
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> persistentListOf() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.persistentVectorOf();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> persistentSetOf(E... eArr) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet.INSTANCE.emptyOf$runtime_release().addAll((java.util.Collection) kotlin.collections.ArraysKt.asList(eArr));
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> persistentSetOf() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet.INSTANCE.emptyOf$runtime_release();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> persistentHashSetOf(E... eArr) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet.INSTANCE.emptyOf$runtime_release().addAll((java.util.Collection) kotlin.collections.ArraysKt.asList(eArr));
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> persistentHashSetOf() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet.INSTANCE.emptyOf$runtime_release();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> persistentMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> emptyOf$runtime_release = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.INSTANCE.emptyOf$runtime_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2 = emptyOf$runtime_release.builder2();
        kotlin.collections.MapsKt.putAll(builder2, pairArr);
        return builder2.build2();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> persistentMapOf() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.INSTANCE.emptyOf$runtime_release();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> persistentHashMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> emptyOf$runtime_release = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.INSTANCE.emptyOf$runtime_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2 = emptyOf$runtime_release.builder2();
        kotlin.collections.MapsKt.putAll(builder2, pairArr);
        return builder2.build2();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> persistentHashMapOf() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.INSTANCE.emptyOf$runtime_release();
    }

    @kotlin.Deprecated(message = "Use persistentListOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "persistentListOf(*elements)", imports = {}))
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> immutableListOf(E... eArr) {
        return persistentListOf(java.util.Arrays.copyOf(eArr, eArr.length));
    }

    @kotlin.Deprecated(message = "Use persistentListOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "persistentListOf()", imports = {}))
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    @kotlin.Deprecated(message = "Use persistentSetOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "persistentSetOf(*elements)", imports = {}))
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> immutableSetOf(E... eArr) {
        return persistentSetOf(java.util.Arrays.copyOf(eArr, eArr.length));
    }

    @kotlin.Deprecated(message = "Use persistentSetOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "persistentSetOf()", imports = {}))
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    @kotlin.Deprecated(message = "Use persistentHashSetOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "persistentHashSetOf(*elements)", imports = {}))
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> immutableHashSetOf(E... eArr) {
        return persistentHashSetOf(java.util.Arrays.copyOf(eArr, eArr.length));
    }

    @kotlin.Deprecated(message = "Use persistentMapOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "persistentMapOf(*pairs)", imports = {}))
    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> immutableMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        return persistentMapOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
    }

    @kotlin.Deprecated(message = "Use persistentHashMapOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "persistentHashMapOf(*pairs)", imports = {}))
    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> immutableHashMapOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        return persistentHashMapOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<T> toImmutableList(java.lang.Iterable<? extends T> iterable) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<T> immutableList = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList ? (androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<T> toImmutableList(kotlin.sequences.Sequence<? extends T> sequence) {
        return toPersistentList(sequence);
    }

    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<java.lang.Character> toImmutableList(java.lang.CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> toPersistentList(java.lang.Iterable<? extends T> iterable) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> persistentList = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList ? (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList) iterable : null;
        if (persistentList != null) {
            return persistentList;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder builder = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder ? (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder) iterable : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> build = builder != null ? builder.build() : null;
        return build == null ? plus(persistentListOf(), (java.lang.Iterable) iterable) : build;
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> toPersistentList(kotlin.sequences.Sequence<? extends T> sequence) {
        return plus(persistentListOf(), (kotlin.sequences.Sequence) sequence);
    }

    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<java.lang.Character> toPersistentList(java.lang.CharSequence charSequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder builder = persistentListOf().builder();
        kotlin.text.StringsKt.toCollection(charSequence, builder);
        return builder.build();
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<T> toImmutableSet(java.lang.Iterable<? extends T> iterable) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<T> immutableSet = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet ? (androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet) iterable : null;
        if (immutableSet != null) {
            return immutableSet;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder builder = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder ? (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder) iterable : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet build = builder != null ? builder.build() : null;
        if (build != null) {
            return build;
        }
        return plus(persistentSetOf(), (java.lang.Iterable) iterable);
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<T> toImmutableSet(kotlin.sequences.Sequence<? extends T> sequence) {
        return toPersistentSet(sequence);
    }

    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<java.lang.Character> toImmutableSet(java.lang.CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<T> toPersistentSet(java.lang.Iterable<? extends T> iterable) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet persistentOrderedSet = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder) iterable : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<T> build = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return build == null ? plus(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet.INSTANCE.emptyOf$runtime_release(), (java.lang.Iterable) iterable) : build;
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<T> toPersistentSet(kotlin.sequences.Sequence<? extends T> sequence) {
        return plus(persistentSetOf(), (kotlin.sequences.Sequence) sequence);
    }

    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<java.lang.Character> toPersistentSet(java.lang.CharSequence charSequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder builder = persistentSetOf().builder();
        kotlin.text.StringsKt.toCollection(charSequence, builder);
        return builder.build();
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<T> toPersistentHashSet(java.lang.Iterable<? extends T> iterable) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet persistentHashSet = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet) iterable : null;
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) iterable : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet build = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        if (build != null) {
            return build;
        }
        return plus(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet.INSTANCE.emptyOf$runtime_release(), (java.lang.Iterable) iterable);
    }

    public static final <T> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<T> toPersistentHashSet(kotlin.sequences.Sequence<? extends T> sequence) {
        return plus(persistentHashSetOf(), (kotlin.sequences.Sequence) sequence);
    }

    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<java.lang.Character> toPersistentHashSet(java.lang.CharSequence charSequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder builder = persistentHashSetOf().builder();
        kotlin.text.StringsKt.toCollection(charSequence, builder);
        return builder.build();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap<K, V> toImmutableMap(java.util.Map<K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap<K, V> immutableMap = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap ? (androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap) map : null;
        if (immutableMap != null) {
            return immutableMap;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder builder = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder ? (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder) map : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build2 = builder != null ? builder.build2() : null;
        if (build2 != null) {
            return build2;
        }
        return persistentMapOf().putAll((java.util.Map) map);
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> toPersistentMap(java.util.Map<K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap persistentOrderedMap = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap) map : null;
        if (persistentOrderedMap != null) {
            return persistentOrderedMap;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder persistentOrderedMapBuilder = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder) map : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build2 = persistentOrderedMapBuilder != null ? persistentOrderedMapBuilder.build2() : null;
        return build2 == null ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.INSTANCE.emptyOf$runtime_release().putAll((java.util.Map) map) : build2;
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> toPersistentHashMap(java.util.Map<K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap persistentHashMap = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap) map : null;
        if (persistentHashMap != null) {
            return persistentHashMap;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder persistentHashMapBuilder = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) map : null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> build2 = persistentHashMapBuilder != null ? persistentHashMapBuilder.build2() : null;
        if (build2 != null) {
            return build2;
        }
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.INSTANCE.emptyOf$runtime_release().putAll((java.util.Map) map);
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, E[] eArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<? extends E> builder = persistentList.builder();
        kotlin.collections.CollectionsKt.addAll(builder, eArr);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, kotlin.sequences.Sequence<? extends E> sequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<? extends E> builder = persistentList.builder();
        kotlin.collections.CollectionsKt.addAll(builder, sequence);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, E[] eArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<? extends E> builder = persistentList.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, eArr);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, kotlin.sequences.Sequence<? extends E> sequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<? extends E> builder = persistentList.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, sequence);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, E[] eArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        kotlin.collections.CollectionsKt.addAll(builder, eArr);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> plus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, kotlin.sequences.Sequence<? extends E> sequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        kotlin.collections.CollectionsKt.addAll(builder, sequence);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, E[] eArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, eArr);
        return builder.build();
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends E> persistentSet, kotlin.sequences.Sequence<? extends E> sequence) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        kotlin.collections.CollectionsKt.removeAll(builder, sequence);
        return builder.build();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> putAll(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        kotlin.collections.MapsKt.putAll(builder2, iterable);
        return builder2.build2();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> putAll(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, kotlin.Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        kotlin.collections.MapsKt.putAll(builder2, pairArr);
        return builder2.build2();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> putAll(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        kotlin.collections.MapsKt.putAll(builder2, sequence);
        return builder2.build2();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, java.lang.Iterable<? extends K> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        kotlin.collections.CollectionsKt.removeAll(builder2.keySet(), iterable);
        return builder2.build2();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, K[] kArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        kotlin.collections.CollectionsKt.removeAll(builder2.keySet(), kArr);
        return builder2.build2();
    }

    public static final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> minus(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<? extends K, ? extends V> persistentMap, kotlin.sequences.Sequence<? extends K> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        kotlin.collections.CollectionsKt.removeAll(builder2.keySet(), sequence);
        return builder2.build2();
    }
}
