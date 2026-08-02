package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\f\u001a\u009b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032$\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0012\u001a»\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00032*\u0010\u000b\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0016\u001aÛ\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\u0013\"\u0004\b\u0006\u0010\u0017*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u000320\u0010\u000b\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u001a\u001aû\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00070\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\u0013\"\u0004\b\u0006\u0010\u0017\"\u0004\b\u0007\u0010\u001b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u000326\u0010\u000b\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u001e\u001a\u009b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\b0\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\u0013\"\u0004\b\u0006\u0010\u0017\"\u0004\b\u0007\u0010\u001b\"\u0004\b\b\u0010\u001f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00070\u00032<\u0010\u000b\u001a8\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0!H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\"\u001a»\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\t0\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\u0013\"\u0004\b\u0006\u0010\u0017\"\u0004\b\u0007\u0010\u001b\"\u0004\b\b\u0010\u001f\"\u0004\b\t\u0010#*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00070\u00032\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\b0\u00032B\u0010\u000b\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t0%H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010&\u001aÛ\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\n0\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\u0013\"\u0004\b\u0006\u0010\u0017\"\u0004\b\u0007\u0010\u001b\"\u0004\b\b\u0010\u001f\"\u0004\b\t\u0010#\"\u0004\b\n\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00070\u00032\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\b0\u00032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\t0\u00032H\u0010\u000b\u001aD\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n0(H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010)\u001aû\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000b0\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\r\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\u0013\"\u0004\b\u0006\u0010\u0017\"\u0004\b\u0007\u0010\u001b\"\u0004\b\b\u0010\u001f\"\u0004\b\t\u0010#\"\u0004\b\n\u0010\u0000\"\u0004\b\u000b\u0010**\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00040\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00050\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00070\u00032\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\b0\u00032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\t0\u00032\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\n0\u00032N\u0010\u000b\u001aJ\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b0,H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010-\u001ag\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032*\u0010\u0018\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00030.¢\u0006\u0004\b0\u00101\u001a\u009e\u0001\u00108\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u000307\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001022/\u00106\u001a+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000104\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020/\u0012\u0004\u0012\u00028\u000302¢\u0006\u0002\b5H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\u008a\u0001\u00108\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u000307\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032/\u00106\u001a+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000104\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020/\u0012\u0004\u0012\u00028\u000302¢\u0006\u0002\b5H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010;\u001a\u009e\u0001\u0010<\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u000307\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001022/\u00106\u001a+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000104\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020/\u0012\u0004\u0012\u00028\u000302¢\u0006\u0002\b5H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u00109\u001a\u008a\u0001\u0010<\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u000307\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032/\u00106\u001a+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000104\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020/\u0012\u0004\u0012\u00028\u000302¢\u0006\u0002\b5H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010;\u001ac\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032 \u00106\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/\u0012\u0006\u0012\u0004\u0018\u00018\u00020.H\u0086\bø\u0001\u0000¢\u0006\u0004\b=\u00101\u001a;\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010>0\u0003¢\u0006\u0004\b?\u0010@\u001a8\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010A\u0018\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0003H\u0086\b¢\u0006\u0004\bB\u0010@\u001a[\u0010E\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\bE\u0010\u0007\u001a\u0081\u0001\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032*\u0010F\u001a&\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D0/\u0012\u0004\u0012\u00028\u00030.¢\u0006\u0004\bE\u0010G\u001ac\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000102¢\u0006\u0004\bH\u0010I\u001a_\u0010J\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\bJ\u0010\u0007\u001ay\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\"\u0010F\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\bJ\u0010\f\u001a¯\u0001\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0003022\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003022\u001e\u0010M\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0086\bø\u0001\u0000¢\u0006\u0004\bJ\u0010N\u001a_\u0010O\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00030\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D0\u0003¢\u0006\u0004\bO\u0010P\u001a\u008b\u0001\u0010O\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00030\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032*\u0010F\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D0.H\u0086\bø\u0001\u0000¢\u0006\u0004\bO\u0010Q\u001a_\u0010R\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00030\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0003¢\u0006\u0004\bR\u0010P\u001a\u008b\u0001\u0010R\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00030\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u00032*\u0010S\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050.H\u0086\bø\u0001\u0000¢\u0006\u0004\bR\u0010Q\u001a7\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00010>\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010U\u001a\u00028\u0000¢\u0006\u0004\bV\u0010W\u001ac\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000102¢\u0006\u0004\b3\u0010I\u001ah\u0010[\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010X\u001a\u00028\u00022)\u0010Z\u001a%\u0012\t\u0012\u00078\u0002¢\u0006\u0002\bY\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/\u0012\u0004\u0012\u00028\u000202H\u0086\bø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"K", "A", "B", "", "other", "Lkotlin/Pair;", "zip", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "Key", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Lkotlin/Function3;", "map", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "D", "E", "c", "d", "Lkotlin/Function4;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "e", "Lkotlin/Function5;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function5;)Ljava/util/Map;", "G", "f", "Lkotlin/Function6;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function6;)Ljava/util/Map;", "H", "g", "Lkotlin/Function7;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function7;)Ljava/util/Map;", com.visa.cbp.getEncExpo.warmup, "h", "Lkotlin/Function8;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function8;)Ljava/util/Map;", "J", "i", "Lkotlin/Function9;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function9;)Ljava/util/Map;", "j", "Lkotlin/Function10;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function10;)Ljava/util/Map;", "L", "k", "Lkotlin/Function11;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function11;)Ljava/util/Map;", "Lkotlin/Function1;", "", "flatMapValues", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "Lkotlin/Function2;", "combine", "Larrow/core/raise/RaiseAccumulate;", "Lkotlin/ExtensionFunctionType;", "transform", "Larrow/core/Either;", "mapOrAccumulate", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Larrow/core/Either;", "Larrow/core/NonEmptyList;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Larrow/core/Either;", "mapValuesOrAccumulate", "mapValuesNotNull", "Larrow/core/Option;", "filterOption", "(Ljava/util/Map;)Ljava/util/Map;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "filterIsInstance", util.h.xy.cb.b.f1091, "Larrow/core/Ior;", "align", "fa", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "salign", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "padZip", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "both", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "unalign", "(Ljava/util/Map;)Lkotlin/Pair;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "unzip", "fc", "V", "key", "getOrNone", "(Ljava/util/Map;Ljava/lang/Object;)Larrow/core/Option;", "initial", "Lkotlin/ParameterName;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MapKt {
    public static final <Key, A, B, C> java.util.Map<Key, C> zip(java.util.Map<Key, ? extends A> map, java.util.Map<Key, ? extends B> map2, kotlin.jvm.functions.Function3<? super Key, ? super A, ? super B, ? extends C> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends A> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            A value = entry.getValue();
            if (map2.containsKey(key)) {
                createMapBuilder.put(key, function3.invoke(key, value, map2.get(key)));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <Key, B, C, D, E> java.util.Map<Key, E> zip(java.util.Map<Key, ? extends B> map, java.util.Map<Key, ? extends C> map2, java.util.Map<Key, ? extends D> map3, kotlin.jvm.functions.Function4<? super Key, ? super B, ? super C, ? super D, ? extends E> function4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends B> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            B value = entry.getValue();
            if (map2.containsKey(key) && map3.containsKey(key)) {
                createMapBuilder.put(key, function4.invoke(key, value, map2.get(key), map3.get(key)));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <Key, B, C, D, E, F> java.util.Map<Key, F> zip(java.util.Map<Key, ? extends B> map, java.util.Map<Key, ? extends C> map2, java.util.Map<Key, ? extends D> map3, java.util.Map<Key, ? extends E> map4, kotlin.jvm.functions.Function5<? super Key, ? super B, ? super C, ? super D, ? super E, ? extends F> function5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends B> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            B value = entry.getValue();
            if (map2.containsKey(key) && map3.containsKey(key) && map4.containsKey(key)) {
                createMapBuilder.put(key, function5.invoke(key, value, map2.get(key), map3.get(key), map4.get(key)));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <Key, B, C, D, E, F, G> java.util.Map<Key, G> zip(java.util.Map<Key, ? extends B> map, java.util.Map<Key, ? extends C> map2, java.util.Map<Key, ? extends D> map3, java.util.Map<Key, ? extends E> map4, java.util.Map<Key, ? extends F> map5, kotlin.jvm.functions.Function6<? super Key, ? super B, ? super C, ? super D, ? super E, ? super F, ? extends G> function6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function6, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends B> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            B value = entry.getValue();
            if (map2.containsKey(key) && map3.containsKey(key) && map4.containsKey(key) && map5.containsKey(key)) {
                createMapBuilder.put(key, function6.invoke(key, value, map2.get(key), map3.get(key), map4.get(key), map5.get(key)));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <Key, B, C, D, E, F, G, H> java.util.Map<Key, H> zip(java.util.Map<Key, ? extends B> map, java.util.Map<Key, ? extends C> map2, java.util.Map<Key, ? extends D> map3, java.util.Map<Key, ? extends E> map4, java.util.Map<Key, ? extends F> map5, java.util.Map<Key, ? extends G> map6, kotlin.jvm.functions.Function7<? super Key, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? extends H> function7) {
        java.util.Map<Key, ? extends C> map7 = map2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function7, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends B> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            B value = entry.getValue();
            if (map7.containsKey(key) && map3.containsKey(key) && map4.containsKey(key) && map5.containsKey(key) && map6.containsKey(key)) {
                createMapBuilder.put(key, function7.invoke(key, value, map7.get(key), map3.get(key), map4.get(key), map5.get(key), map6.get(key)));
            }
            map7 = map2;
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <Key, B, C, D, E, F, G, H, I> java.util.Map<Key, I> zip(java.util.Map<Key, ? extends B> map, java.util.Map<Key, ? extends C> map2, java.util.Map<Key, ? extends D> map3, java.util.Map<Key, ? extends E> map4, java.util.Map<Key, ? extends F> map5, java.util.Map<Key, ? extends G> map6, java.util.Map<Key, ? extends H> map7, kotlin.jvm.functions.Function8<? super Key, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? extends I> function8) {
        java.util.Map<Key, ? extends C> map8 = map2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function8, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends B> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            B value = entry.getValue();
            if (map8.containsKey(key) && map3.containsKey(key) && map4.containsKey(key) && map5.containsKey(key) && map6.containsKey(key) && map7.containsKey(key)) {
                createMapBuilder.put(key, function8.invoke(key, value, map8.get(key), map3.get(key), map4.get(key), map5.get(key), map6.get(key), map7.get(key)));
            }
            map8 = map2;
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <Key, B, C, D, E, F, G, H, I, J> java.util.Map<Key, J> zip(java.util.Map<Key, ? extends B> map, java.util.Map<Key, ? extends C> map2, java.util.Map<Key, ? extends D> map3, java.util.Map<Key, ? extends E> map4, java.util.Map<Key, ? extends F> map5, java.util.Map<Key, ? extends G> map6, java.util.Map<Key, ? extends H> map7, java.util.Map<Key, ? extends I> map8, kotlin.jvm.functions.Function9<? super Key, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? extends J> function9) {
        java.util.Map<Key, ? extends C> map9 = map2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function9, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends B> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            B value = entry.getValue();
            if (map9.containsKey(key) && map3.containsKey(key) && map4.containsKey(key) && map5.containsKey(key) && map6.containsKey(key) && map7.containsKey(key) && map8.containsKey(key)) {
                createMapBuilder.put(key, function9.invoke(key, value, map9.get(key), map3.get(key), map4.get(key), map5.get(key), map6.get(key), map7.get(key), map8.get(key)));
            }
            map9 = map2;
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <Key, B, C, D, E, F, G, H, I, J, K> java.util.Map<Key, K> zip(java.util.Map<Key, ? extends B> map, java.util.Map<Key, ? extends C> map2, java.util.Map<Key, ? extends D> map3, java.util.Map<Key, ? extends E> map4, java.util.Map<Key, ? extends F> map5, java.util.Map<Key, ? extends G> map6, java.util.Map<Key, ? extends H> map7, java.util.Map<Key, ? extends I> map8, java.util.Map<Key, ? extends J> map9, kotlin.jvm.functions.Function10<? super Key, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? super J, ? extends K> function10) {
        java.util.Map<Key, ? extends C> map10 = map2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function10, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends B> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            B value = entry.getValue();
            if (map10.containsKey(key) && map3.containsKey(key) && map4.containsKey(key) && map5.containsKey(key) && map6.containsKey(key) && map7.containsKey(key) && map8.containsKey(key) && map9.containsKey(key)) {
                createMapBuilder.put(key, function10.invoke(key, value, map10.get(key), map3.get(key), map4.get(key), map5.get(key), map6.get(key), map7.get(key), map8.get(key), map9.get(key)));
            }
            map10 = map2;
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <Key, B, C, D, E, F, G, H, I, J, K, L> java.util.Map<Key, L> zip(java.util.Map<Key, ? extends B> map, java.util.Map<Key, ? extends C> map2, java.util.Map<Key, ? extends D> map3, java.util.Map<Key, ? extends E> map4, java.util.Map<Key, ? extends F> map5, java.util.Map<Key, ? extends G> map6, java.util.Map<Key, ? extends H> map7, java.util.Map<Key, ? extends I> map8, java.util.Map<Key, ? extends J> map9, java.util.Map<Key, ? extends K> map10, kotlin.jvm.functions.Function11<? super Key, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? super J, ? super K, ? extends L> function11) {
        java.util.Map<Key, ? extends C> map11 = map2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map11, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function11, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<Key, ? extends B> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            B value = entry.getValue();
            if (map11.containsKey(key) && map3.containsKey(key) && map4.containsKey(key) && map5.containsKey(key) && map6.containsKey(key) && map7.containsKey(key) && map8.containsKey(key) && map9.containsKey(key) && map10.containsKey(key)) {
                createMapBuilder.put(key, function11.invoke(key, value, map11.get(key), map3.get(key), map4.get(key), map5.get(key), map6.get(key), map7.get(key), map8.get(key), map9.get(key), map10.get(key)));
            }
            map11 = map2;
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <K, A, B> java.util.Map<K, B> flatMapValues(java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends A>, ? extends java.util.Map<K, ? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
            java.util.Map<K, ? extends B> invoke = function1.invoke(entry);
            if (invoke.containsKey(entry.getKey())) {
                createMapBuilder.put(entry.getKey(), invoke.get(entry.getKey()));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <K, A, B> java.util.Map<K, B> mapValuesNotNull(java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
            B invoke = function1.invoke(entry);
            if (invoke != null) {
                createMapBuilder.put(entry.getKey(), invoke);
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <K, A> java.util.Map<K, A> filterOption(java.util.Map<K, ? extends arrow.core.Option<? extends A>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.util.Map.Entry<K, ? extends arrow.core.Option<? extends A>> entry : map.entrySet()) {
            K key = entry.getKey();
            arrow.core.Option<? extends A> value = entry.getValue();
            if (!(value instanceof arrow.core.None)) {
                if (value instanceof arrow.core.Some) {
                    createMapBuilder.put(key, ((arrow.core.Some) value).getValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <K, A, B> java.util.Map<K, kotlin.Pair<A, B>> padZip(java.util.Map<K, ? extends A> map, java.util.Map<K, ? extends B> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        return padZip(map, map2, new kotlin.jvm.functions.Function3() { // from class: arrow.core.MapKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Pair pair;
                pair = kotlin.TuplesKt.to(obj2, obj3);
                return pair;
            }
        });
    }

    public static final <K, A, B, C> java.util.Map<K, C> padZip(java.util.Map<K, ? extends A> map, java.util.Map<K, ? extends B> map2, kotlin.jvm.functions.Function2<? super K, ? super A, ? extends C> function2, kotlin.jvm.functions.Function2<? super K, ? super B, ? extends C> function22, kotlin.jvm.functions.Function3<? super K, ? super A, ? super B, ? extends C> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (a.d dVar : kotlin.collections.SetsKt.plus((java.util.Set) map.keySet(), (java.lang.Iterable) map2.keySet())) {
            if (map.containsKey(dVar) && map2.containsKey(dVar)) {
                createMapBuilder.put(dVar, function3.invoke(dVar, map.get(dVar), map2.get(dVar)));
            } else if (map.containsKey(dVar)) {
                createMapBuilder.put(dVar, function2.invoke(dVar, map.get(dVar)));
            } else if (map2.containsKey(dVar)) {
                createMapBuilder.put(dVar, function22.invoke(dVar, map2.get(dVar)));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <K, A, B, C> kotlin.Pair<java.util.Map<K, A>, java.util.Map<K, B>> unalign(java.util.Map<K, ? extends C> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends C>, ? extends arrow.core.Ior<? extends A, ? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<K, ? extends C> entry : map.entrySet()) {
            arrow.core.Ior<? extends A, ? extends B> invoke = function1.invoke(entry);
            if (invoke instanceof arrow.core.Ior.Left) {
                linkedHashMap.put(entry.getKey(), ((arrow.core.Ior.Left) invoke).getValue());
            } else if (invoke instanceof arrow.core.Ior.Right) {
                linkedHashMap2.put(entry.getKey(), ((arrow.core.Ior.Right) invoke).getValue());
            } else if (invoke instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) invoke;
                java.lang.Object leftValue = both.getLeftValue();
                java.lang.Object rightValue = both.getRightValue();
                linkedHashMap.put(entry.getKey(), leftValue);
                linkedHashMap2.put(entry.getKey(), rightValue);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return kotlin.TuplesKt.to(linkedHashMap, linkedHashMap2);
    }

    public static final <K, A, B, C> kotlin.Pair<java.util.Map<K, A>, java.util.Map<K, B>> unzip(java.util.Map<K, ? extends C> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends C>, ? extends kotlin.Pair<? extends A, ? extends B>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<K, ? extends C> entry : map.entrySet()) {
            kotlin.Pair<? extends A, ? extends B> invoke = function1.invoke(entry);
            A component1 = invoke.component1();
            B component2 = invoke.component2();
            linkedHashMap.put(entry.getKey(), component1);
            linkedHashMap2.put(entry.getKey(), component2);
        }
        return kotlin.TuplesKt.to(linkedHashMap, linkedHashMap2);
    }

    public static final <K, V> arrow.core.Option<V> getOrNone(java.util.Map<K, ? extends V> map, K k) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        V v = map.get(k);
        if (v == null && !map.containsKey(k)) {
            return arrow.core.None.INSTANCE;
        }
        return new arrow.core.Some(v);
    }

    public static final <K, A> java.util.Map<K, A> combine(java.util.Map<K, ? extends A> map, java.util.Map<K, ? extends A> map2, kotlin.jvm.functions.Function2<? super A, ? super A, ? extends A> function2) {
        A invoke;
        A invoke2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (map.size() < map2.size()) {
            for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
                K key = entry.getKey();
                java.lang.Object value = entry.getValue();
                a.d dVar = (java.lang.Object) map2.get(key);
                if (dVar != null && (invoke2 = function2.invoke(value, dVar)) != null) {
                    value = invoke2;
                }
                map2 = (java.util.Map<K, A>) kotlin.collections.MapsKt.plus(map2, new kotlin.Pair(key, value));
            }
            return (java.util.Map<K, A>) map2;
        }
        for (java.util.Map.Entry<K, ? extends A> entry2 : map2.entrySet()) {
            K key2 = entry2.getKey();
            java.lang.Object value2 = entry2.getValue();
            a.d dVar2 = (java.lang.Object) map.get(key2);
            if (dVar2 != null && (invoke = function2.invoke(dVar2, value2)) != null) {
                value2 = invoke;
            }
            map = (java.util.Map<K, A>) kotlin.collections.MapsKt.plus(map, new kotlin.Pair(key2, value2));
        }
        return (java.util.Map<K, A>) map;
    }

    public static final <K, A, B> java.util.Map<K, kotlin.Pair<A, B>> zip(java.util.Map<K, ? extends A> map, java.util.Map<K, ? extends B> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
        for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
            K key = entry.getKey();
            A value = entry.getValue();
            if (map2.containsKey(key)) {
                createMapBuilder.put(key, new kotlin.Pair(value, map2.get(key)));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    @kotlin.Deprecated(message = "Deprecated to allow for future alignment with stdlib Map#map returning List", replaceWith = @kotlin.ReplaceWith(expression = "mapValuesOrAccumulate(combine, transform)", imports = {}))
    public static final <K, E, A, B> arrow.core.Either<E, java.util.Map<K, B>> mapOrAccumulate(java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super E, ? super E, ? extends E> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<E>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function22) {
        java.lang.Throwable nonFatalOrThrow;
        java.lang.Throwable nonFatalOrThrow2;
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        boolean z = false;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
            arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.RaiseAccumulate raiseAccumulate = new arrow.core.raise.RaiseAccumulate(defaultRaise3);
                for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
                    arrow.core.raise.RaiseAccumulate raiseAccumulate2 = raiseAccumulate;
                    arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(z);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                        arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(z);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise6;
                            arrow.core.raise.RaiseAccumulate raiseAccumulate3 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise5), defaultRaise7, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise7));
                            boolean hasErrors = raiseAccumulate3.hasErrors();
                            java.util.Map.Entry<K, ? extends A> entry2 = entry;
                            B invoke = function22.invoke(raiseAccumulate3, entry2);
                            if (!hasErrors) {
                                createMapBuilder.put(entry2.getKey(), invoke);
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
                java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                defaultRaise.complete();
                return new arrow.core.Either.Right(build);
            } catch (arrow.core.raise.RaiseCancellationException e3) {
                defaultRaise3.complete();
                java.util.Iterator<E> it = arrow.core.NonEmptyList.m9567boximpl(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise3)).getAll()).iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                E next = it.next();
                while (it.hasNext()) {
                    next = function2.invoke(next, it.next());
                }
                defaultRaise2.raise(next);
                throw new kotlin.KotlinNothingValueException();
            } finally {
            }
        } catch (arrow.core.raise.RaiseCancellationException e4) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e4, defaultRaise));
        } finally {
        }
    }

    @kotlin.Deprecated(message = "Deprecated to allow for future alignment with stdlib Map#map returning List", replaceWith = @kotlin.ReplaceWith(expression = "mapValuesOrAccumulate(transform)", imports = {}))
    public static final <K, E, A, B> arrow.core.Either<arrow.core.NonEmptyList<E>, java.util.Map<K, B>> mapOrAccumulate(java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<E>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function2) {
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
            arrow.core.raise.RaiseAccumulate raiseAccumulate = new arrow.core.raise.RaiseAccumulate(defaultRaise);
            for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
                arrow.core.raise.RaiseAccumulate raiseAccumulate2 = raiseAccumulate;
                defaultRaise = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.RaiseAccumulate raiseAccumulate3 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise2), defaultRaise3, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise3));
                        boolean hasErrors = raiseAccumulate3.hasErrors();
                        java.util.Map.Entry<K, ? extends A> entry2 = entry;
                        B invoke = function2.invoke(raiseAccumulate3, entry2);
                        if (!hasErrors) {
                            createMapBuilder.put(entry2.getKey(), invoke);
                        }
                        raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        raisedOrRethrow = raiseAccumulate2.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise)).getAll());
                    } catch (java.lang.Throwable th) {
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    defaultRaise.complete();
                } catch (arrow.core.raise.RaiseCancellationException e2) {
                    defaultRaise.complete();
                    raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise);
                } finally {
                    defaultRaise.complete();
                    java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (raiseAccumulate.hasErrors() && (latestError = raiseAccumulate.getLatestError()) != null) {
                latestError.getValue();
                throw new kotlin.KotlinNothingValueException();
            }
            java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
            defaultRaise.complete();
            return new arrow.core.Either.Right(build);
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise));
        } catch (java.lang.Throwable th2) {
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }

    public static final <K, E, A, B> arrow.core.Either<E, java.util.Map<K, B>> mapValuesOrAccumulate(java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super E, ? super E, ? extends E> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<E>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function22) {
        java.lang.Throwable nonFatalOrThrow;
        java.lang.Throwable nonFatalOrThrow2;
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        boolean z = false;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
            arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.RaiseAccumulate raiseAccumulate = new arrow.core.raise.RaiseAccumulate(defaultRaise3);
                for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
                    arrow.core.raise.RaiseAccumulate raiseAccumulate2 = raiseAccumulate;
                    arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(z);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                        arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(z);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise6;
                            arrow.core.raise.RaiseAccumulate raiseAccumulate3 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise5), defaultRaise7, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise7));
                            boolean hasErrors = raiseAccumulate3.hasErrors();
                            java.util.Map.Entry<K, ? extends A> entry2 = entry;
                            B invoke = function22.invoke(raiseAccumulate3, entry2);
                            if (!hasErrors) {
                                createMapBuilder.put(entry2.getKey(), invoke);
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
                java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                defaultRaise.complete();
                return new arrow.core.Either.Right(build);
            } catch (arrow.core.raise.RaiseCancellationException e3) {
                defaultRaise3.complete();
                java.util.Iterator<E> it = arrow.core.NonEmptyList.m9567boximpl(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise3)).getAll()).iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                E next = it.next();
                while (it.hasNext()) {
                    next = function2.invoke(next, it.next());
                }
                defaultRaise2.raise(next);
                throw new kotlin.KotlinNothingValueException();
            } finally {
            }
        } catch (arrow.core.raise.RaiseCancellationException e4) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e4, defaultRaise));
        } finally {
        }
    }

    public static final <K, E, A, B> arrow.core.Either<arrow.core.NonEmptyList<E>, java.util.Map<K, B>> mapValuesOrAccumulate(java.util.Map<K, ? extends A> map, kotlin.jvm.functions.Function2<? super arrow.core.raise.RaiseAccumulate<E>, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function2) {
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(map.size());
            arrow.core.raise.RaiseAccumulate raiseAccumulate = new arrow.core.raise.RaiseAccumulate(defaultRaise);
            for (java.util.Map.Entry<K, ? extends A> entry : map.entrySet()) {
                arrow.core.raise.RaiseAccumulate raiseAccumulate2 = raiseAccumulate;
                defaultRaise = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.RaiseAccumulate raiseAccumulate3 = new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise2), defaultRaise3, new arrow.core.raise.RaiseKt__RaiseAccumulateKt$accumulating$1$1$1(defaultRaise3));
                        boolean hasErrors = raiseAccumulate3.hasErrors();
                        java.util.Map.Entry<K, ? extends A> entry2 = entry;
                        B invoke = function2.invoke(raiseAccumulate3, entry2);
                        if (!hasErrors) {
                            createMapBuilder.put(entry2.getKey(), invoke);
                        }
                        raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        defaultRaise.complete();
                        raisedOrRethrow = raiseAccumulate2.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise)).getAll());
                    } catch (java.lang.Throwable th) {
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    defaultRaise.complete();
                } catch (arrow.core.raise.RaiseCancellationException e2) {
                    defaultRaise.complete();
                    raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise);
                } finally {
                    defaultRaise.complete();
                    java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (raiseAccumulate.hasErrors() && (latestError = raiseAccumulate.getLatestError()) != null) {
                latestError.getValue();
                throw new kotlin.KotlinNothingValueException();
            }
            java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
            defaultRaise.complete();
            return new arrow.core.Either.Right(build);
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise));
        } catch (java.lang.Throwable th2) {
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }

    public static final /* synthetic */ <K, R> java.util.Map<K, R> filterIsInstance(java.util.Map<K, ?> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<K, ?> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE);
            if (value instanceof java.lang.Object) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, A, B> java.util.Map<K, arrow.core.Ior<A, B>> align(java.util.Map<K, ? extends A> map, java.util.Map<K, ? extends B> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.lang.Object obj : kotlin.collections.SetsKt.plus((java.util.Set) map.keySet(), (java.lang.Iterable) map2.keySet())) {
            if (map.containsKey(obj) && map2.containsKey(obj)) {
                createMapBuilder.put(obj, new arrow.core.Ior.Both(map.get(obj), map2.get(obj)));
            } else if (map.containsKey(obj)) {
                createMapBuilder.put(obj, new arrow.core.Ior.Left(map.get(obj)));
            } else if (map2.containsKey(obj)) {
                createMapBuilder.put(obj, new arrow.core.Ior.Right(map2.get(obj)));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, A, B, C> java.util.Map<K, C> align(java.util.Map<K, ? extends A> map, java.util.Map<K, ? extends B> map2, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends arrow.core.Ior<? extends A, ? extends B>>, ? extends C> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.lang.Object obj : kotlin.collections.SetsKt.plus((java.util.Set) map.keySet(), (java.lang.Iterable) map2.keySet())) {
            if (map.containsKey(obj) && map2.containsKey(obj)) {
                createMapBuilder.put(obj, function1.invoke(new arrow.core.Entry(obj, new arrow.core.Ior.Both(map.get(obj), map2.get(obj)))));
            } else if (map.containsKey(obj)) {
                createMapBuilder.put(obj, function1.invoke(new arrow.core.Entry(obj, new arrow.core.Ior.Left(map.get(obj)))));
            } else if (map2.containsKey(obj)) {
                createMapBuilder.put(obj, function1.invoke(new arrow.core.Entry(obj, new arrow.core.Ior.Right(map2.get(obj)))));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, A> java.util.Map<K, A> salign(java.util.Map<K, ? extends A> map, java.util.Map<K, ? extends A> map2, kotlin.jvm.functions.Function2<? super A, ? super A, ? extends A> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.lang.Object obj : kotlin.collections.SetsKt.plus((java.util.Set) map.keySet(), (java.lang.Iterable) map2.keySet())) {
            if (map.containsKey(obj) && map2.containsKey(obj)) {
                createMapBuilder.put(obj, function2.invoke(map.get(obj), map2.get(obj)));
            } else if (map.containsKey(obj)) {
                createMapBuilder.put(obj, map.get(obj));
            } else if (map2.containsKey(obj)) {
                createMapBuilder.put(obj, map2.get(obj));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <K, A, B, C> java.util.Map<K, C> padZip(java.util.Map<K, ? extends A> map, java.util.Map<K, ? extends B> map2, kotlin.jvm.functions.Function3<? super K, ? super A, ? super B, ? extends C> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (a.d dVar : kotlin.collections.SetsKt.plus((java.util.Set) map.keySet(), (java.lang.Iterable) map2.keySet())) {
            if (map.containsKey(dVar) && map2.containsKey(dVar)) {
                createMapBuilder.put(dVar, function3.invoke(dVar, map.get(dVar), map2.get(dVar)));
            } else if (map.containsKey(dVar)) {
                createMapBuilder.put(dVar, function3.invoke(dVar, map.get(dVar), null));
            } else if (map2.containsKey(dVar)) {
                createMapBuilder.put(dVar, function3.invoke(dVar, null, map2.get(dVar)));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final <K, A, B> kotlin.Pair<java.util.Map<K, A>, java.util.Map<K, B>> unalign(java.util.Map<K, ? extends arrow.core.Ior<? extends A, ? extends B>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<K, ? extends arrow.core.Ior<? extends A, ? extends B>> entry : map.entrySet()) {
            arrow.core.Ior<? extends A, ? extends B> value = entry.getValue();
            if (value instanceof arrow.core.Ior.Left) {
                linkedHashMap.put(entry.getKey(), ((arrow.core.Ior.Left) value).getValue());
            } else if (value instanceof arrow.core.Ior.Right) {
                linkedHashMap2.put(entry.getKey(), ((arrow.core.Ior.Right) value).getValue());
            } else {
                if (!(value instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) value;
                java.lang.Object leftValue = both.getLeftValue();
                java.lang.Object rightValue = both.getRightValue();
                linkedHashMap.put(entry.getKey(), leftValue);
                linkedHashMap2.put(entry.getKey(), rightValue);
            }
        }
        return kotlin.TuplesKt.to(linkedHashMap, linkedHashMap2);
    }

    public static final <K, A, B> kotlin.Pair<java.util.Map<K, A>, java.util.Map<K, B>> unzip(java.util.Map<K, ? extends kotlin.Pair<? extends A, ? extends B>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<K, ? extends kotlin.Pair<? extends A, ? extends B>> entry : map.entrySet()) {
            kotlin.Pair<? extends A, ? extends B> value = entry.getValue();
            A component1 = value.component1();
            B component2 = value.component2();
            linkedHashMap.put(entry.getKey(), component1);
            linkedHashMap2.put(entry.getKey(), component2);
        }
        return kotlin.TuplesKt.to(linkedHashMap, linkedHashMap2);
    }

    public static final <K, A, B> B fold(java.util.Map<K, ? extends A> map, B b, kotlin.jvm.functions.Function2<? super B, ? super java.util.Map.Entry<? extends K, ? extends A>, ? extends B> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.util.Iterator<java.util.Map.Entry<K, ? extends A>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            b = function2.invoke(b, it.next());
        }
        return b;
    }
}
